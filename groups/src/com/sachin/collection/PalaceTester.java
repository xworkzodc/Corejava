package com.sachin.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PalaceTester {

	public static void main(String[] args) {

		String palace1 = "Lake palace, Udaipur";
		String palace2 = "Mysore Palace, Mysore";
		String palace3 = "Rambagh palace, Jaipur";
		String palace4 = "Marble palace, Kolkata";
		String palace5 = "Amer Fort, Amer";
		String palace6 = "Laxmi vilas Palace, Gujarat";

		Collection collection = new ArrayList(8);
		boolean added = false;
		added = collection.add(palace6);
		added = collection.add(palace5);
		added = collection.add(palace4);
		added = collection.add("Bangalore palace");
		added = collection.add(palace3);
		added = collection.add(palace2);
		added = collection.add(palace1);

		System.out.println(added);
		System.out.println(collection);

		int total = collection.size();
		System.out.println("total no " + total);

		String check = "Amer Fort, Amer";
		boolean contain = collection.contains(check);
		System.out.println("contain check " + contain);

		System.out.println("removed palace1 " + collection.remove(palace1));
		boolean removed = collection.remove("Rambagh palace, Jaipur");
		System.out.println("removed Rambagh palace, Jaipur " + removed);

		Iterator iterator = collection.iterator();
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

		System.out.println(iterator.next());

		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

		System.out.println(iterator.next());

		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasNext());

		System.out.println(iterator.next());

		System.out.println(collection);
		collection.clear();
		System.out.println(collection);
		System.out.println("size " + collection.size());

	}

}
