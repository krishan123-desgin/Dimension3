package com.example.booking.model;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Long id;
    private Long userId;
    private Long showId;
    private List<BookedSeat> seats = new ArrayList<>();
    private double totalAmount;
    private PaymentMethod paymentMethod;
    private CardType cardType;

    public Booking() {}

    public Booking(Long id, Long userId, Long showId) {
        this.id = id;
        this.userId = userId;
        this.showId = showId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public List<BookedSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<BookedSeat> seats) {
        this.seats = seats;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
