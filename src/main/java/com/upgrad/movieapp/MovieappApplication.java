package com.upgrad.movieapp;

import com.upgrad.movieapp.dao.CustomerDao;
import com.upgrad.movieapp.dao.MovieDao;
import com.upgrad.movieapp.dao.TheaterDao;
import com.upgrad.movieapp.entities.City;
import com.upgrad.movieapp.entities.Customer;
import com.upgrad.movieapp.entities.Movie;
import com.upgrad.movieapp.entities.Theatre;
import com.upgrad.movieapp.services.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
@SpringBootApplication
public class MovieappApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MovieappApplication.class, args);
//		CustomerDao customerDAO = context.getBean(CustomerDao.class);
//
//		Customer customer = new Customer();
//		customer.setFirstName("Emma");
//		customer.setLastName("Stone");
//		customer.setUserName("email123stone");
//		customer.setPassword("******");
//		customer.setDateOfBirth(LocalDateTime.of(1988,11,6,0,0));
//
//		System.out.println("Before saving :" +customer);
//		Customer savedCustomer = customerDAO.save(customer);
//		System.out.println("After saving"+savedCustomer);
//
//		Customer retrivedCustomer = customerDAO.findById(savedCustomer.getCustomerId());
//		System.out.println(("Rtrieved customer :"+retrivedCustomer));
//
//		customer.setUserName("newName");
//		Customer updatedCustomer = customerDAO.update(customer);
//		System.out.println("Updated customer : "+updatedCustomer);
//
//		customerDAO.delete(updatedCustomer);
//		System.out.println("After deltetion :"+customerDAO.findById(updatedCustomer.getCustomerId()));

		/**
		 * CRUD operation on Movies
		 */
//		MovieDao movieDao = context.getBean(MovieDao.class);
//		System.out.println("Bean of MovieDao:" +movieDao);
//
//		Movie movie = new Movie();
//
//		movie.setMovieName("AvebgersInfibity War");
//		movie.setMovieDescription("The Avengers should mast stop Thanos");
//		movie.setRelease_date(LocalDateTime.of(2024,10,27,5,10));
//		movie.setDuration(150);
//		movie.setCover_photo_url("Cover photo url");
//		movie.setTrailer_url("Trailer url");
//
//		System.out.println("Befor saving :"+movie);
//
//		Movie savedMovie = movieDao.save(movie);
//
//		System.out.println("After saving :"+movie);
//
//		//Search based on primary key which is movie id
//		Movie retrivedMovie = movieDao.findById(savedMovie.getMovieId()).orElse(null);
//		System.out.println("Retrived movie :" +retrivedMovie);
//
//		//Update duration
//		movie.setDuration(160);
//		Movie movieUpdated = movieDao.save(movie);
//		System.out.println("Updated movie :" +movieUpdated);
//
//		//Delete movie
//		movieDao.delete(movieUpdated);
//		Movie retrivedMovie1 = movieDao.findById(savedMovie.getMovieId()).orElse(null);
//		System.out.println("Retrived movie after deletion:" +retrivedMovie1);

		/**
		 * CRUD operation on Theater
		 */
//
//		TheaterDao theaterDao = context.getBean(TheaterDao.class);
//		System.out.println("Bean of TheaterDao"+theaterDao);
//
////		Theatre theatre = new Theatre();
////
////		theatre.setTheatreName("McLean Theatre");
//////		theatre.setCity("McLean");
////		System.out.println("Befor saving :"+theatre);
////		Theatre savedTheater = theaterDao.save(theatre);
////		System.out.println("After saving :"+savedTheater);
////
////		Theatre theatre1 = new Theatre();
//////		theatre1.setTheatre_id(2);
////		theatre1.setTheatreName("Viena Theatre");
//////		theatre.setCity("Viena");
////		System.out.println("Befor saving :"+theatre1);
////		Theatre savedTheater1 = theaterDao.save(theatre1);
////		System.out.println("After saving :"+savedTheater1);
////
////		Theatre theatre2 = new Theatre();
//////		theatre2.setTheatre_id(3);
////		theatre2.setTheatreName("Sterling Theatre");
//////		theatre.setCity("Sterling");
////
////		System.out.println("Befor saving :"+theatre2);
////		Theatre savedTheater2 = theaterDao.save(theatre2);
////		System.out.println("After saving :"+savedTheater2);
////
////		System.out.println("After saving :"+savedTheater);
////		System.out.println("After saving :"+savedTheater1);
////		System.out.println("After saving :"+savedTheater2);

		/**
		 * Testing Movie Service
		 */

		//get bean of Movie Service
		MovieService movieService = context.getBean(MovieService.class);
		System.out.println("Movie Service Bean: "+movieService);

		Movie movie1 = new Movie();

		movie1.setMovieName("AvebgersInfibity War");
		movie1.setMovieDescription("The Avengers should mast stop Thanos");
		movie1.setRelease_date(LocalDateTime.of(2024,10,27,5,10));
		movie1.setDuration(150);
		movie1.setCover_photo_url("Cover photo url");
		movie1.setTrailer_url("Trailer url");

		Movie savedMovie = movieService.acceptMovieDetails(movie1);
		System.out.println(savedMovie);

		Movie searchedMovie = movieService.getMovieDetails(savedMovie.getMovieId());
		System.out.println("Searched movie:"+searchedMovie);
	}

	@RequestMapping(value="/")
	public String helloStudents() {
		return "Hello Students to Spring Boot!" ;}
}