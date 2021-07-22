package com.sachin.dto.moviedto.base;

import java.io.Serializable;

public class MovieDTO implements Serializable {
	private String movieName;
	private String director;
	private int noOfArtist;

	public MovieDTO() {
		System.out.println("invoked MoviedDTO");
	}

	public MovieDTO(String movieName, String director, int noOfArtist) {
		super();
		this.movieName = movieName;
		this.director = director;
		this.noOfArtist = noOfArtist;
	}

	@Override
	public String toString() {
		return "MovieDTO [movieName=" + movieName + ", director=" + director + ", noOfArtist=" + noOfArtist + "]";
	}

}
