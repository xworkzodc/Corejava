package com.sachin;

public class Tester {

		public static void main(String[] args) {

			RelieveRule relieveRule = new Developer("Darshan");

			Xworkz xworkz = new Xworkz();
			xworkz.setRule(relieveRule);
			xworkz.employeeExit();
		}
	}

