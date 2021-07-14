package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Movie;

public interface MovieService {

	public Movie createMovie(Movie movie);
	public List<Movie> getAllMovie();
	
}
