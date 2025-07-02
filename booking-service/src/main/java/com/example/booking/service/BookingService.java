package com.example.booking.service;

import com.example.booking.model.BookedSeat;
import com.example.booking.model.Booking;
import com.example.booking.model.CardType;
import com.example.booking.model.PaymentMethod;
import com.example.booking.payment.PaymentProcessor;
import com.example.booking.payment.PaymentProcessorFactory;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookingService {
    private final Map<Long, Booking> bookings = new HashMap<>();
    private final SeatLockManager seatLockManager = SeatLockManager.getInstance();
    private long idCounter = 1;

    public synchronized Booking createBooking(Long userId,
                                              Long showId,
                                              double amount,
                                              PaymentMethod method,
                                              CardType cardType,
                                              List<BookedSeat> seats) {
        for (BookedSeat seat : seats) {
            String key = showId + "-" + seat.getSeatNumber();
            if (!seatLockManager.lockSeat(key)) {
                throw new IllegalStateException("Seat already booked: " + seat.getSeatNumber());
            }
        }
        try {
            Booking booking = new Booking.Builder()
                    .id(idCounter++)
                    .userId(userId)
                    .showId(showId)
                    .seats(seats)
                    .totalAmount(amount)
                    .paymentMethod(method)
                    .cardType(cardType)
                    .build();
            PaymentProcessor processor = PaymentProcessorFactory.createProcessor(method, cardType);
            processor.process(amount);
            bookings.put(booking.getId(), booking);
            return booking;
        } finally {
            for (BookedSeat seat : seats) {
                seatLockManager.unlockSeat(showId + "-" + seat.getSeatNumber());
            }
        }
    }

    public Collection<Booking> allBookings() {
        return bookings.values();
    }
}
