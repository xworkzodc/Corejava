package com.sachin.deep_clone.copy_mobile.base;

public class Battery implements Cloneable {
	public String batteryType;
	public int mAh;

	public Battery(String batteryType, int mAh) {
		this.batteryType = batteryType;
		this.mAh = mAh;
	}
	
	@Override
	public Battery clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Battery)super.clone();
	}

	public void displayInfo() {
		System.out.println("batteryType " + this.batteryType);
		System.out.println("mAh " + this.mAh);
	}

}
