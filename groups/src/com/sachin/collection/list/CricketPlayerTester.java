package com.sachin.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CricketPlayerTester {

	public static void main(String[] args) {
		List<String> menCricketPlayerList = new ArrayList<>();
		menCricketPlayerList.add("Rohit sharma");
		menCricketPlayerList.add("K L Rahul");
		menCricketPlayerList.add("Virat kohli");
		menCricketPlayerList.add("Rishab Pant");
		menCricketPlayerList.add("Hardik Pandya");

		List<String> womenCricketPlayerList = new ArrayList<>();
		womenCricketPlayerList.add("Smriti Mandhana");
		womenCricketPlayerList.add("Shafali verma");
		womenCricketPlayerList.add("Deepti Sharma");
		womenCricketPlayerList.add("Harleen Deol");
	
	List<String> cricketPlayerList = new ArrayList<>();
	cricketPlayerList.addAll(menCricketPlayerList);
	cricketPlayerList.addAll(womenCricketPlayerList);
	Collections.sort(cricketPlayerList);
	System.out.println(cricketPlayerList);
	System.out.println("--------------LIST METHOD---------------------");
	
	System.out.println(cricketPlayerList.add("Sachin"));
	cricketPlayerList.add(6, "Ishan Kishan");
	System.out.println(cricketPlayerList.contains("Rishab Pant"));
	System.out.println(cricketPlayerList.get(2));
	System.out.println(cricketPlayerList.isEmpty());	
	System.out.println(cricketPlayerList.remove(7));
	System.out.println(cricketPlayerList.subList(2, 8));
	//cricketPlayerList.clear();
	System.out.println(cricketPlayerList);
	System.out.println("-----------------------------------");
	
	System.out.println(cricketPlayerList.size());
	System.out.println(cricketPlayerList);
	System.out.println("-----------------------------------");
	
	Iterator<String> playerItr= cricketPlayerList.iterator();
	while (playerItr.hasNext())
	{
		String name=playerItr.next();
		System.out.println(name);
	}
	System.out.println("-----------------------------------");
	
	ListIterator<String> playerListItr=cricketPlayerList.listIterator(9);
	while(playerListItr.hasPrevious())
	{
		String list=playerListItr.previous();
		System.out.println(list);
	}
	
	System.out.println("-----------------------------------");
	boolean remove=cricketPlayerList.removeAll(cricketPlayerList);
	System.out.println(remove);
	System.out.println(cricketPlayerList);
	System.out.println("-----------------------------------");
	boolean contain=cricketPlayerList.containsAll(womenCricketPlayerList);
	System.out.println(contain);
	boolean retain=cricketPlayerList.retainAll(menCricketPlayerList);
	System.out.println(retain);
			
	}
}
