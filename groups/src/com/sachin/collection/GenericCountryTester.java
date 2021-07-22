package com.sachin.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericCountryTester {

	public static void main(String[] args) {
		String country1 = "India";
		String country2 = "Sri lanka";
		String country3 = "Australia";
		String country4 = "Japan";
		String country5 = "Egypt";
		String country6 = "France";
		String country7 = "Germany";
		String country8 = "Switzerland";

		Collection<String> country = new ArrayList<>();
		country.add(country8);
		country.add(country7);
		country.add(country6);
		country.add(country5);
		country.add(country4);
		country.add(country3);
		country.add(country2);
		country.add(country1);

		Iterator<String> iterator = country.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("Country lowercase " + str.toLowerCase());
			System.out.println("Country uppercase " + str.toUpperCase());

		}
	}

}
