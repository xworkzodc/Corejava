package com.sachin.collection.dto.base;

public class ChocolateDTO {
	private String brand;
	private int price;
	private double gram;
	private String color;
	private double meltingTemp;
	private boolean cholesterol;

	public ChocolateDTO() {
		System.out.println("created ChocolateDTO");
	}

	public ChocolateDTO(String brand, int price, double gram, String color, double meltingTemp, boolean cholesterol) {
		super();
		this.brand = brand;
		this.price = price;
		this.gram = gram;
		this.color = color;
		this.meltingTemp = meltingTemp;
		this.cholesterol = cholesterol;
	}

	@Override
	public String toString() {
		return "ChocolateDTO [brand=" + brand + ", price=" + price + ", gram=" + gram + ", color=" + color
				+ ", meltingTemp=" + meltingTemp + ", cholesterol=" + cholesterol + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method of object");

		if (obj == null)
			return false;
		if (obj instanceof ChocolateDTO) {
			ChocolateDTO cast = (ChocolateDTO) obj;
			if (this.brand.equalsIgnoreCase(cast.brand) && this.color.equals(cast.color))
				System.out.println("both are equals" + this.brand);
			return true;
		} else {
			System.out.println("oil is not equal" + this.brand);
			return false;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getGram() {
		return gram;
	}

	public void setGram(double gram) {
		this.gram = gram;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMeltingTemp() {
		return meltingTemp;
	}

	public void setMeltingTemp(double meltingTemp) {
		this.meltingTemp = meltingTemp;
	}

	public boolean isCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(boolean cholesterol) {
		this.cholesterol = cholesterol;
	}

}
