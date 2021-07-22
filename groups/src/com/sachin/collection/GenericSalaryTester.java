package com.sachin.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class GenericSalaryTester {

	public static void main(String[] args) {
		double salary1 = 20000.00;
		double salary2 = 30000.00;
		double salary3 = 40000.00;
		double salary4 = 50000.00;
		double salary5 = 60000.00;
		double salary6 = 80000.00;

		Collection<Double> sal = new ArrayList<>();
		sal.add(salary1);
		sal.add(salary2);
		sal.add(salary3);
		sal.add(salary4);
		sal.add(salary5);
		sal.add(salary6);

		Iterator<Double> itr = sal.iterator();

		while (itr.hasNext()) {
			double num = itr.next();
			System.out.println("------------");
			if (num <= 25000) {
				System.out.println("salary lesser than 25000 is not good salary");
				System.out.println(num);
			}
			if (num >= 25000) {
				System.out.println("salary greater than 25000 is good salary");
				System.out.println(num);
			}
			if (num >= 50000) {
				System.out.println("salary greater than 50000 is great salary");
				System.out.println(num);
			}
		}
	}
}
