package com.sachin.charge.sub;

import com.sachin.charge.base.Battery;

public class DryBattery extends Battery {
	public DryBattery() {
		super();
	}

	public void change() {
		super.discharge();
	}

	@Override
	public void discharge() {
		System.out.println("discharge");
	}

}
