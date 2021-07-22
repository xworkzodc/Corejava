package com.sachin.default_clone_shallow.copy_app.base;

public class Application implements Cloneable {
	public String name;
	public double version;
	public String[] developers;

	@Override
	public Application clone() throws CloneNotSupportedException {
		System.out.println("invoking clone method");
		return (Application) super.clone();
	}

	public void displayInfo() {
		System.out.println("name " + name);
		System.out.println("version " + version);
		if (developers != null) {
			for (int i = 0; i < developers.length; i++) {
				System.out.println(developers[i]);
			}
		}
	}
}
