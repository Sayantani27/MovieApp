package com.upgrad.movieapp.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Theatre")
public class Theatre {
    @Id
    @GeneratedValue
    private int theatreId;

    @Column(length = 20, nullable = false, unique = true)
    private String theatreName;
    @Column(nullable = false)
    private float ticketPrice = 150.00f;
    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @ManyToMany(mappedBy = "theaters")
    private Set<Movie> movies;
    public int getTheatre_id() {
        return theatreId;
    }

    public void setTheatre_id(int theatre_id) {
        this.theatreId = theatre_id;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "theatre_id=" + theatreId +
                ", theatreName='" + theatreName + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", city=" + city +
                '}';
    }
}
