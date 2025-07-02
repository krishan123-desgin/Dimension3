package com.example.booking.payment;

import com.example.booking.model.CardType;

public class CardPaymentProcessor implements PaymentProcessor {
    private final CardType cardType;

    public CardPaymentProcessor(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public void process(double amount) {
        // Simulate processing card payment
        System.out.println("Processing " + cardType + " card payment: " + amount);
    }
}
