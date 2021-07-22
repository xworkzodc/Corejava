package com.sachin.dto.televisiondto.base;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TelevisionDTO implements Serializable {
	private String brand;
	private double price;
	private boolean smart;

	public TelevisionDTO() {
		System.out.println("invoked default television constructor");
	}

	@Override
	public String toString() {
		return "TelevisionDTO [brand=" + brand + ", price=" + price + ", smart=" + smart + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

}
