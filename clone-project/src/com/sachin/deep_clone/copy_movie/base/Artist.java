package com.sachin.deep_clone.copy_movie.base;

public class Artist implements Cloneable {
	public String directorName;
	public String producerName;
	public int noOfArtist;

	public Artist(String directorName, String producerName, int noOfArtist) {
		this.directorName = directorName;
		this.producerName = producerName;
		this.noOfArtist = noOfArtist;
	}

	@Override
	public Artist clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Artist) super.clone();
	}

	public void displayAll() {
		System.out.println("directorName " + this.directorName);
		System.out.println("producerName " + this.producerName);
		System.out.println("noOfArtist " + this.noOfArtist);
	}

}
