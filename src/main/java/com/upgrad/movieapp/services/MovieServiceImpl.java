package com.upgrad.movieapp.services;

import com.upgrad.movieapp.dao.MovieDao;
import com.upgrad.movieapp.entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    public MovieDao movieDao;

    @Override
    @Transactional // it will indicate all movies i.e. 10 movies either get stored in database or nothing i.e. Automic attribute is achieved
    public Movie acceptMovieDetails(Movie movie) {
        return movieDao.save(movie);
    }

    @Override
    public List<Movie> acceptMultipleMovieDetails(List<Movie> movies) {
        //return list of movies
        List<Movie> savedMovies = new ArrayList<>();
        for(Movie movie : movies){
            savedMovies.add(acceptMovieDetails(movie));
        }
    }

    @Override
    public Movie getMovieDetails(int id) {
        return movieDao.findById(id).get();
    }

    @Override
    public Movie updateMovieDetails(int id, Movie movie) {
        Movie savedMovie = getMovieDetails(id);

        savedMovie.setMovieName(movie.getMovieName());
        savedMovie.setMovieDescription(movie.getMovieDescription());
        savedMovie.setDuration(movie.getDuration());
        savedMovie.setTrailer_url(movie.getTrailer_url());
        savedMovie.setCover_photo_url(movie.getCover_photo_url());
        savedMovie.setRelease_date(movie.getRelease_date());
        return movieDao.save(savedMovie);
    }

    @Override
    public boolean deleteMovie(int id) {
        Movie deleteMovie = getMovieDetails(id);
        if (deleteMovie == null){
            return false;
        }
        movieDao.delete(deleteMovie);
        return true;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDao.findAll();
    }

    @Override
    public Page<Movie> getPaginatedMovieDetails(Pageable pageRequest) {
        return movieDao.findAll(pageRequest);
    }
}
