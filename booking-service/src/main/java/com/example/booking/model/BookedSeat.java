package com.example.booking.model;

public class BookedSeat {
    private String seatNumber;
    private String screenName;

    public BookedSeat() {}

    public BookedSeat(String seatNumber, String screenName) {
        this.seatNumber = seatNumber;
        this.screenName = screenName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
}
