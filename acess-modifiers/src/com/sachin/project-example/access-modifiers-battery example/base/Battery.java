package com.sachin.charge.base;

import com.sachin.charge.constant.BatteryType;

public class Battery {
	public BatteryType type;
	private int price=100;

	protected Battery() {
		System.out.println("invoked battery constructor");
	}

	protected void discharge() {
		System.out.println("battery type " + type);
		System.out.println("price " + price);
	}
}
