package com.sachin.dto.placedto.base;

import java.io.Serializable;

public class PlaceDTO implements Serializable {
	private static final long serialVersionUID = 5621719850772626852L;
	private String placeName;
	private String area;
	private int pincode;

	public PlaceDTO() {
		System.out.println("invoked placeDTO");
	}

	public PlaceDTO(String placeName, String area, int pincode) {
		super();
		this.placeName = placeName;
		this.area = area;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "PlaceDTO [placeName=" + placeName + ", area=" + area + ", pincode=" + pincode + "]";
	}

}
