package com.example.booking.controller;

import com.example.booking.model.BookedSeat;
import com.example.booking.model.Booking;
import com.example.booking.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService service;

    public BookingController(BookingService service) {
        this.service = service;
    }

    @PostMapping
    public Booking create(@RequestParam Long userId,
                          @RequestParam Long showId,
                          @RequestBody List<BookedSeat> seats) {
        return service.createBooking(userId, showId, seats);
    }

    @GetMapping
    public Collection<Booking> all() {
        return service.allBookings();
    }
}
