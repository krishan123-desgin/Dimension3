package com.example.theater.model;

import java.time.LocalDateTime;

public class Show {
    private Long id;
    private Long screenId;
    private Long movieId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Show() {}

    public Show(Long id, Long screenId, Long movieId, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.screenId = screenId;
        this.movieId = movieId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScreenId() {
        return screenId;
    }

    public void setScreenId(Long screenId) {
        this.screenId = screenId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
