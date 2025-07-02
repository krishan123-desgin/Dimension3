package com.example.booking.service;

import com.example.booking.model.BookedSeat;
import com.example.booking.model.Booking;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookingService {
    private final Map<Long, Booking> bookings = new HashMap<>();
    private final SeatLockManager seatLockManager = new SeatLockManager();
    private long idCounter = 1;

    public synchronized Booking createBooking(Long userId, Long showId, List<BookedSeat> seats) {
        for (BookedSeat seat : seats) {
            String key = showId + "-" + seat.getSeatNumber();
            if (!seatLockManager.lockSeat(key)) {
                throw new IllegalStateException("Seat already booked: " + seat.getSeatNumber());
            }
        }
        try {
            Booking booking = new Booking(idCounter++, userId, showId);
            booking.setSeats(seats);
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
