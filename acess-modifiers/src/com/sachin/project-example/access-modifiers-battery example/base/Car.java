package com.sachin.charge.base;

public class Car {
	public String brand;

	public Car() {
		System.out.println("invoked car constructor");
	}

	public void start() {
		Battery bat = new Battery();
		bat.discharge();
		// System.out.println(bat.price);
	}
}
