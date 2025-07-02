package com.example.theater.model;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private Long id;
    private String name;
    private final List<Seat> seats = new ArrayList<>();

    public Screen() {}
    public Screen(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
