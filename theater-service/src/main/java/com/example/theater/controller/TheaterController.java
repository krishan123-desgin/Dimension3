package com.example.theater.controller;

import com.example.theater.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/theaters")
public class TheaterController {
    private final Map<Long, Theater> theaters = new HashMap<>();
    private long idCounter = 1;

    @PostMapping
    public Theater create(@RequestBody Theater theater) {
        theater.setId(idCounter++);
        theaters.put(theater.getId(), theater);
        return theater;
    }

    @GetMapping
    public Collection<Theater> all() {
        return theaters.values();
    }
}
