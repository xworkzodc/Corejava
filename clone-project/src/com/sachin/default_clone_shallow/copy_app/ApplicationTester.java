package com.sachin.default_clone_shallow.copy_app;

import com.sachin.default_clone_shallow.copy_app.base.Application;

public class ApplicationTester {

	public static void main(String[] args) {
		Application app = new Application();
		app.name = "clubhouse";
		app.version = 8.2;
		String[] developers = new String[2];
		developers[0] = "Sachin";
		developers[1] = "Darshan";
		app.developers = developers;
		app.displayInfo();
		System.out.println("--------------");
		try {
			Application app2 = app.clone();
			System.out.println("name " + app2.name);
			System.out.println("version " + app2.version);
			app.developers = app2.developers;
			if (app2.developers != null) {
				for (int i = 0; i < app2.developers.length; i++) {
					System.out.println(app2.developers[i]);
				}
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
