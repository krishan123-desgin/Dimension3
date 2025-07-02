package com.example.theater.model;

public class Seat {
    private String number;
    private SeatCategory category;

    public Seat() {}
    public Seat(String number, SeatCategory category) {
        this.number = number;
        this.category = category;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public SeatCategory getCategory() {
        return category;
    }

    public void setCategory(SeatCategory category) {
        this.category = category;
    }
}
