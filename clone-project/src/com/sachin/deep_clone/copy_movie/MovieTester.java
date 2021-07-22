package com.sachin.deep_clone.copy_movie;

import com.sachin.deep_clone.copy_movie.base.Artist;

public class MovieTester {
	public static void main(String[] args) {
		Artist art = new Artist(" Soori", "K P Srikanth", 200);
		Movie movie = new Movie("Tagaru", 2.09, art);
		movie.displayAll();
		System.out.println("-------------");
		try {
			Movie movie2 = movie.clone();
			movie2.displayAll();
			System.out.println("-------------");
			movie.artist.noOfArtist = 350;
			System.out.println("updated noOfArtist movie " + movie.artist.noOfArtist);
			System.out.println("updated noOfArtist movie2 " + movie2.artist.noOfArtist);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
