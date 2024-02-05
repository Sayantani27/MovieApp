package com.upgrad.movieapp.services;

import com.upgrad.movieapp.entities.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MovieService {
    //accepts movie an argument and after saving it will return Movie object
    public Movie acceptMovieDetails(Movie movie);

    //either all or none of the transaction will be updated
    public  List<Movie> acceptMultipleMovieDetails(List<Movie> movies);

    //it will take id of a movie and with the help of data access layer it will return a Movie
    public Movie getMovieDetails( int id);

    //it takes a movie id , movie and return a movie
    public Movie updateMovieDetails( int movieId , Movie movie );

    //it takes an id and deletes it
    public boolean deleteMovie(int id);

    //list of all movies
    public List<Movie> getAllMovies();

    //paginated movie details
    public Page<Movie> getPaginatedMovieDetails(Pageable pageRequest);









}
