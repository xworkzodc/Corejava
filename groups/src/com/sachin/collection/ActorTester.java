package com.sachin.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ActorTester {

	public static void main(String[] args) {
		String actor1 = "Sunny leone";
		String actor2 = "Rashmika";
		String actor3 = "Ramya";
		String actor4 = "Radhika kumarswamy";
		String actor5 = "Dhananjay";
		String actor6 = "Darshan";
		String actor7 = "Sudeep";
		String actor8 = "Upendra";

		Collection collection = new ArrayList(10);
		boolean added = false;
		added = collection.add(actor1);
		added = collection.add(actor2);
		added = collection.add(actor3);

		added = collection.add("Dhanveer");
		added = collection.add("Rakshit shetty");

		added = collection.add(actor4);
		added = collection.add(actor5);
		added = collection.add(actor6);
		added = collection.add(actor7);
		added = collection.add(actor8);

		System.out.println(added);
		System.out.println(collection);

		int total = collection.size();
		System.out.println("total no " + total);

		String check = "sachin";
		boolean contain = collection.contains(check);
		System.out.println("contain check " + contain);

		System.out.println("removed actor3 " + collection.remove(actor3));
		boolean removed = collection.remove("Rashmika");
		System.out.println("removed rashmika " + removed);

		Iterator iterator = collection.iterator();

		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		// System.out.println(iterator.next());

		System.out.println(collection);
		collection.clear();
		System.out.println(collection);
		System.out.println("size " + collection.size());

	}

}
