package com.sachin.collection.dto.base;

import com.sachin.collection.dto.constant.OilColor;
import com.sachin.collection.dto.constant.OilType;

public class OilDTO {
	private String brand;
	private double price;
	private OilType type;
	private OilColor color;
	private boolean quantity;
	private boolean usedforcook;
	private boolean refined;
	private double viscosity;

	public OilDTO() {
		System.out.println("created OilDTO");
	}

	public OilDTO(String brand, double price, OilType type, OilColor color, boolean quantity, boolean usedforcook,
			boolean refined, double viscosity) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.color = color;
		this.quantity = quantity;
		this.usedforcook = usedforcook;
		this.refined = refined;
		this.viscosity = viscosity;
	}

	@Override
	public String toString() {
		return "OilDTO [brand=" + brand + ", price=" + price + ", type=" + type + ", color=" + color + ", quantity="
				+ quantity + ", usedforcook=" + usedforcook + ", refined=" + refined + ", viscosity=" + viscosity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method of object");

		if (obj == null)
			return false;
		if (obj instanceof OilDTO) {
			OilDTO cast = (OilDTO) obj;
			if (this.type.equals(cast.getType()) && this.color.equals(cast.color)
					&& this.brand.equals(cast.getBrand())) {
				System.out.println("oil equals" + this.brand);
				return true;
			} else {
				System.out.println("oil is not equal" + this.brand);
				return false;
			}
		}
		return true;

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

	public OilType getType() {
		return type;
	}

	public void setType(OilType type) {
		this.type = type;
	}

	public OilColor getColor() {
		return color;
	}

	public void setColor(OilColor color) {
		this.color = color;
	}

	public boolean isQuantity() {
		return quantity;
	}

	public void setQuantity(boolean quantity) {
		this.quantity = quantity;
	}

	public boolean isUsedforcook() {
		return usedforcook;
	}

	public void setUsedforcook(boolean usedforcook) {
		this.usedforcook = usedforcook;
	}

	public boolean isRefined() {
		return refined;
	}

	public void setRefined(boolean refined) {
		this.refined = refined;
	}

	public double getViscosity() {
		return viscosity;
	}

	public void setViscosity(double viscosity) {
		this.viscosity = viscosity;
	}

}

