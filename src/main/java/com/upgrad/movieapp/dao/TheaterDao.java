package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterDao extends JpaRepository<Theatre , Integer> {
}
