package com.example.movie.controller;

import com.example.movie.model.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final Map<Long, Movie> movies = new HashMap<>();
    private long idCounter = 1;

    @PostMapping
    public Movie create(@RequestBody Movie movie) {
        movie.setId(idCounter++);
        movies.put(movie.getId(), movie);
        return movie;
    }

    @GetMapping
    public Collection<Movie> all() {
        return movies.values();
    }
}
