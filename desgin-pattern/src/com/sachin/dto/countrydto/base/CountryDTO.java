package com.sachin.dto.countrydto.base;

import java.io.Serializable;

public class CountryDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int noOfState;
	private int noOfPopulation;

	public CountryDTO() {
		System.out.println("invoked countryDTO");
	}

	@Override
	public String toString() {
		return "CountryDTO [name=" + name + ", noOfState=" + noOfState + ", noOfPopulation=" + noOfPopulation + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfState() {
		return noOfState;
	}

	public void setNoOfState(int noOfState) {
		this.noOfState = noOfState;
	}

	public int getNoOfPopulation() {
		return noOfPopulation;
	}

	public void setNoOfPopulation(int noOfPopulation) {
		this.noOfPopulation = noOfPopulation;
	}
}
