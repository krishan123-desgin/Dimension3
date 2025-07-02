package com.example.booking.payment;

public class UpiPaymentProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        // Simulate processing UPI payment
        System.out.println("Processing UPI payment: " + amount);
    }
}
