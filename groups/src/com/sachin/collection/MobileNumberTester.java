package com.sachin.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumberTester {

	public static void main(String[] args) {
		long mobileNumber = 8095946885l;
		long mobileNumber2 = 9538560534l;
		long mobileNumber3 = 9986538251l;
		long mobileNumber4 = 7019575274l;
		long mobileNumber5 = 9148755841l;
		long mobileNumber6 = 9876543210l;

		Collection<Long> collection = new ArrayList<>();
		boolean added = false;
		added = collection.add(mobileNumber);
		added = collection.add(mobileNumber2);
		added = collection.add(mobileNumber3);

		//added = collection.add(1234567890);
		//added = collection.add("9898989898");

		added = collection.add(mobileNumber4);
		added = collection.add(mobileNumber5);
		added = collection.add(mobileNumber6);

		System.out.println(added);
		System.out.println(collection);

		int total = collection.size();
		System.out.println("total no " + total);

		long check = 9148755841l;
		boolean contain = collection.contains(check);
		System.out.println("contain check " + contain);

		System.out.println("removed mobileNumber5 " + collection.remove(mobileNumber));
		boolean removed = collection.remove(1234567890);
		System.out.println("removed 1234567890 " + removed);

		Iterator iterator = collection.iterator();
		System.out.println(collection.size());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());


		System.out.println(collection);
		collection.clear();
		System.out.println(collection);
		System.out.println("size " + collection.size());

	}

}
