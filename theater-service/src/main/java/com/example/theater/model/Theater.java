package com.example.theater.model;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private Long id;
    private String name;
    private String address;
    private final List<Screen> screens = new ArrayList<>();

    public Theater() {}

    public Theater(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Screen> getScreens() {
        return screens;
    }
}
