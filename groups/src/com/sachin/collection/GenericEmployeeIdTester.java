package com.sachin.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericEmployeeIdTester {

	public static void main(String[] args) {
		int employeeId1 = 111;
		int employeeId2 = 222;
		int employeeId3 = 333;
		int employeeId4 = 444;
		int employeeId5 = 555;
		int employeeId6 = 666;

		Collection<Integer> id = new ArrayList<>();
		id.add(employeeId4);
		id.add(employeeId5);
		id.add(employeeId6);
		id.add(employeeId3);
		id.add(employeeId2);
		id.add(employeeId1);
		
		System.out.println("name"+id);

		Iterator<Integer> itr = id.iterator();
		while (itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}

	}

}
