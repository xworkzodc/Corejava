package com.sachin.charge.base;

public class HeliumBattery extends Battery {
	public HeliumBattery() {
		super();
	}

	public void superCharge() {
		super.discharge();
	}
}
