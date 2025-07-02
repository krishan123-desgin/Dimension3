# Movie Ticket Booking Microservices

This repository contains a simple Spring Boot based microservices setup for a movie ticket booking application. The services included are:

- **movie-service**: Manages movies with durations.
- **theater-service**: Manages theaters, screens, seats and shows.
- **booking-service**: Handles user bookings with seat locking for concurrency.
- **payment-service**: A stub for payment operations.

Each service is a Spring Boot application with an independent build configuration.


## Concurrency

Seat booking operations use a `SeatLockManager` that relies on `ReentrantLock` to ensure that a seat cannot be booked concurrently by multiple users.

## Design Patterns

The codebase demonstrates several design patterns:

- **Singleton**: `SeatLockManager` is implemented as a lazy-loaded singleton to manage seat locks globally.
- **Builder**: `Booking` objects are created via an inner `Builder` for readable construction.
- **Factory/Strategy**: Payment processing uses `PaymentProcessorFactory` to select a `PaymentProcessor` implementation at runtime.
