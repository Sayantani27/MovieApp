package com.upgrad.movieapp.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieId;
    @Column(length = 50, nullable = false, unique = true)
    private String movieName;
    @Column(name = "movie_desc", length = 500, nullable = false)
    private String movieDescription;
    @Column(nullable = false)
    private LocalDateTime release_date;
    @Column(nullable = false)
    private int duration;
    @Column(length = 500, nullable = false)
    private String cover_photo_url;
    @Column(length = 500, nullable = false)
    private String trailer_url;
    @Column(nullable = false)
    private int status_id;

    @ManyToMany
    private Set<Theatre> theaters;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public LocalDateTime getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDateTime release_date) {
        this.release_date = release_date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCover_photo_url() {
        return cover_photo_url;
    }

    public void setCover_photo_url(String cover_photo_url) {
        this.cover_photo_url = cover_photo_url;
    }

    public String getTrailer_url() {
        return trailer_url;
    }

    public void setTrailer_url(String trailer_url) {
        this.trailer_url = trailer_url;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                ", release_date=" + release_date +
                ", duration=" + duration +
                ", cover_photo_url='" + cover_photo_url + '\'' +
                ", trailer_url='" + trailer_url + '\'' +
                ", status_id=" + status_id +
                '}';
    }
}
