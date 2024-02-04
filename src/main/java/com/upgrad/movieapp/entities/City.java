package com.upgrad.movieapp.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="City")
public class City {

    @Id
    @GeneratedValue
    private int cityId;

    @Column(length = 20 , nullable = false)
    private String cityName;

    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<Theatre> theatres;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCity_name() {
        return cityName;
    }

    public void setCity_name(String city_name) {
        this.cityName = city_name;
    }

    public Set<Theatre> getTheatres() {
        return theatres;
    }

    public void setTheatres(Set<Theatre> theatres) {
        this.theatres = theatres;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", city_name='" + cityName + '\'' +
                ", theatres=" + theatres +
                '}';
    }
}
