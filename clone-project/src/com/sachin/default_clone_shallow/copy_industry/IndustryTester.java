package com.sachin.copy_industry;

import com.sachin.copy_industry.base.Industry;

public class IndustryTester {

	public static void main(String[] args) {

		Industry ind = new Industry();
		ind.name = "	ADM";
		ind.type = "Agricultural";
		ind.noOfEmployees = 2000;
		ind.displayInfo();
		System.out.println("--------------");
		try {
			Industry ind1 = (Industry) ind.clone();
			System.out.println("name " + ind1.name);
			System.out.println("type " + ind1.type);
			System.out.println("noOf Emp " + ind1.noOfEmployees);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
