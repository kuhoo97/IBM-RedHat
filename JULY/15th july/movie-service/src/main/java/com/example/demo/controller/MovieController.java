package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieService;

@RestController
public class MovieController {
	
	private MovieService movieService;
	private Environment environment;
	
	@Autowired
	public MovieController(MovieService movieService, Environment environment) {
	
		this.movieService = movieService;
		this.environment = environment;
	}
	
	/*    
	 * 
	@GetMapping
	public ResponseEntity<String> getStatus() {
		return ResponseEntity.ok("app running and up on port" + environment.getProperty("local.server.port"));
	}
	
	@PostMapping("/movies")
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movie)
	{
		return  ResponseEntity.status(HttpStatus.CREATED).body(movieService.createMovie(movie));
	}
	
	@GetMapping("/movies")
	public ResponseEntity<?> getAllMovie()
	{
		return ResponseEntity.ok(movieService.getAllMovie());
	}
	
	*/
	
	//Implementing using zipkin server, sleuth and fein client
	
	@GetMapping
	public String getStatus() {
		return "app running and up on port" + environment.getProperty("local.server.port");
	}
	
	@PostMapping("/movies")
	public Movie createMovie(@RequestBody Movie movie)
	{
		return movieService.createMovie(movie);
	}
	
	@GetMapping("/movies")
	public List<Movie> getAllMovie()
	{
		return movieService.getAllMovie();
	}
	
	@GetMapping("/movies/{movieName}")
	public Movie getMovieByName(@PathVariable("movieName") String movieName)
	{
		return movieService.findByMovieName(movieName);
	}
	
	

}
