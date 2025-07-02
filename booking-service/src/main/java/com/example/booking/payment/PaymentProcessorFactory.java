package com.example.booking.payment;

import com.example.booking.model.CardType;
import com.example.booking.model.PaymentMethod;

public class PaymentProcessorFactory {
    public static PaymentProcessor createProcessor(PaymentMethod method, CardType cardType) {
        return switch (method) {
            case CASH -> new CashPaymentProcessor();
            case UPI -> new UpiPaymentProcessor();
            case CARD -> new CardPaymentProcessor(cardType);
        };
    }
}
