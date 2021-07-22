package com.sachin.deep_clone.copy_movie;

import com.sachin.deep_clone.copy_movie.base.Artist;

public class Movie implements Cloneable {
	public String name;
	public double movieDuration;
	public Artist artist;

	public Movie(String name, double movieDuration, Artist artist) {
		this.name = name;
		this.movieDuration = movieDuration;
		this.artist = artist;
	}

	@Override
	public Movie clone() throws CloneNotSupportedException {
		Movie clonedRef = (Movie) super.clone();
		if (this.artist != null) {
			clonedRef.artist = artist.clone();
		}
		return clonedRef;
	}

	public void displayAll() {
		System.out.println("movie name " + this.name);
		System.out.println("movieDuration " + this.movieDuration);
		if (this.artist != null) {
			this.artist.displayAll();
		}
	}
}
