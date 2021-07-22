package com.sachin.deep_clone.copy_mobile;

import com.sachin.deep_clone.copy_mobile.base.Battery;
import com.sachin.deep_clone.copy_mobile.base.Mobile;

public class MobileTester {

	public static void main(String[] args) {
		Battery bat = new Battery("Li-ion", 5000);
		Mobile mob = new Mobile("redmi", 13000, "6gb", bat);
		mob.displayInfo();
		System.out.println("----------------");
		try {
			Mobile mob2 = mob.clone();
			mob2.displayInfo();
			mob.battery.mAh = 10000;
			System.out.println("mob updated mAh " + mob.battery.mAh);
			System.out.println("mob2 updated mAh " + mob2.battery.mAh);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
