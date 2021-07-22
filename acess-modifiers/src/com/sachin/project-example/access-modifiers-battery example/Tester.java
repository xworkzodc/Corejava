package com.sachin.charge;

import com.sachin.charge.base.Battery;
import com.sachin.charge.base.Car;
import com.sachin.charge.base.HeliumBattery;
import com.sachin.charge.constant.BatteryType;
import com.sachin.charge.sub.DryBattery;
import com.sachin.charge.sub.Ups;

public class Tester {

	public static void main(String[] args) {
		// Battery bat=new Battery();
		// bat.discharge();
		// System.out.println(bat.price);
		System.out.println(BatteryType.LITHIUM_ION);
		System.out.println("-------------------------");

		Car car = new Car();
		car.start();

		System.out.println("-------------------------");
		HeliumBattery helium = new HeliumBattery();
		helium.superCharge();

		System.out.println("-------------------------");
		DryBattery dry = new DryBattery();
		dry.change();
		dry.discharge();

		System.out.println("-------------------------");
		Ups ups = new Ups();
		ups.supply();

	}

}
