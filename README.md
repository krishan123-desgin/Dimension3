# Movie Ticket Booking Microservices

This repository contains a simple Spring Boot based microservices setup for a movie ticket booking application. The services included are:

- **movie-service**: Manages movies with durations.
- **theater-service**: Manages theaters, screens, seats and shows.
- **booking-service**: Handles user bookings with seat locking for concurrency.
- **payment-service**: A stub for payment operations.

Each service is a Spring Boot application with an independent build configuration.


## Concurrency

Seat booking operations use a `SeatLockManager` that relies on `ReentrantLock` to ensure that a seat cannot be booked concurrently by multiple users.
