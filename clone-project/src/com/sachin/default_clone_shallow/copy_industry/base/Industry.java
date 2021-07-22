package com.sachin.copy_industry.base;

public class Industry implements Cloneable {

	public String name;
	public String type;
	public int noOfEmployees;

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("invoked clone method");
		return super.clone();
	}

	public void displayInfo() {
		System.out.println("name " + name);
		System.out.println("type " + type);
		System.out.println("noOfEmp " + noOfEmployees);
	}

}
