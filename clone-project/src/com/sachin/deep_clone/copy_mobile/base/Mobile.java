package com.sachin.deep_clone.copy_mobile.base;

public class Mobile implements Cloneable {
	public String brand;
	public int price;
	public String ram;
	public Battery battery;

	public Mobile(String brand, int price, String ram, Battery battery) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.battery = battery;
	}

	@Override
	public Mobile clone() throws CloneNotSupportedException {
		Mobile clonedRef = (Mobile) super.clone();
		if (this.battery != null) {
			clonedRef.battery = battery.clone();
		}
		return clonedRef;
	}

	public void displayInfo() {
		System.out.println("brand " + this.brand);
		System.out.println("price " + this.price);
		System.out.println("ram " + this.ram);
		if (this.battery != null) {
			this.battery.displayInfo();
		}
	}
}
