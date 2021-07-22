package com.sachin.dto.countrydto;

import com.sachin.dto.countrydto.base.CountryDTO;

public class CountryTester {

	public static void main(String[] args) {
		CountryDTO country = new CountryDTO();
		country.setName("india");
		country.setNoOfState(28);
		country.setNoOfPopulation(1393753499);

		System.out.println(country.getName());
		System.out.println(country.getNoOfState());
		System.out.println(country.getNoOfPopulation());

		System.out.println(country);

	}

}
