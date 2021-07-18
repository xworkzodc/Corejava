package com.sachin.datastore.dto;

import java.io.Serializable;

public class RiverDTO implements Serializable {
	private String name;
	private String origin;
	private double length;
	private int noOfStatesInFLow;
	private boolean hydroPlant;

	public RiverDTO() {

	}

	public RiverDTO(String name, String origin, double length, int noOfStatesInFLow, boolean hydroPlant) {
		super();
		this.name = name;
		this.origin = origin;
		this.length = length;
		this.noOfStatesInFLow = noOfStatesInFLow;
		this.hydroPlant = hydroPlant;
	}

	@Override
	public String toString() {
		return "RiverDTO [name=" + name + ", origin=" + origin + ", length=" + length + ", noOfStatesInFLow="
				+ noOfStatesInFLow + ", hydroPlant=" + hydroPlant + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof RiverDTO) {
			RiverDTO other = (RiverDTO) obj;
			if (this.name.equals(other.getName()))
				return true;
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getNoOfStatesInFLow() {
		return noOfStatesInFLow;
	}

	public void setNoOfStatesInFLow(int noOfStatesInFLow) {
		this.noOfStatesInFLow = noOfStatesInFLow;
	}

	public boolean isHydroPlant() {
		return hydroPlant;
	}

	public void setHydroPlant(boolean hydroPlant) {
		this.hydroPlant = hydroPlant;
	}

}
