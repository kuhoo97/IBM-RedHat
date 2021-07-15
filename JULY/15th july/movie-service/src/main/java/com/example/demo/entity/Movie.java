package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Data
@Entity

public class Movie {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer movieId;
	@Column(name = "movie_name",unique = true)
	private String movieName;
	@Enumerated(EnumType.STRING)
	private Genre genre;
	@JsonProperty
	private Boolean isAvailable;
	public Movie(String movieName, Genre genre, Boolean isAvailable) {
		super();
		this.movieName = movieName;
		this.genre = genre;
		this.isAvailable = isAvailable;
	
	
}
}