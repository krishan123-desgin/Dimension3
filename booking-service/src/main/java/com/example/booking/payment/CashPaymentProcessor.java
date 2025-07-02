package com.example.booking.payment;

public class CashPaymentProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        // Simulate processing cash payment
        System.out.println("Processing cash payment: " + amount);
    }
}
