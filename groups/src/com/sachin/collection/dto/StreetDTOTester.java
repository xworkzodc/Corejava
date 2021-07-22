package com.sachin.collection.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.sachin.collection.dto.base.StreetDTO;

public class StreetDTOTester {

	public static void main(String[] args) {
		StreetDTO street1=new StreetDTO("Durgigudi", 577217, "canera Bank", "Honnali");
		StreetDTO street2=new StreetDTO("TungaBadra", 577217, "SVEMS School", "Honnali");
	
		StreetDTO street3=new StreetDTO();
		street3.setName("T B Cricle");
		street3.setPincode(577217);
		street3.setLandMark("H P petrol bunk");
		street3.setCity("Honnali");
		
		List<StreetDTO> streetList = new ArrayList<>();
		streetList.add(street1);
		streetList.add(street2);
		streetList.add(street3);
		
		System.out.println(streetList.size());
		
		ListIterator<StreetDTO> streetItr=streetList.listIterator(3);
		while(streetItr.hasPrevious())
		{
			StreetDTO list=streetItr.previous();
			System.out.println(list);
		}
		System.out.println("-------------------------");
		
		for (int i = 0; i < streetList.size(); i++) {
			System.out.println(streetList.get(i));
			
		}
		System.out.println(streetList.size());
		
		
		System.out.println("--------------LIST METHOD---------------------");
		
		System.out.println(streetList.add(street1));
		streetList.add(0, street2);
		System.out.println(streetList.contains(streetList));
		System.out.println(streetList.get(2));
		System.out.println(streetList.isEmpty());	
		System.out.println(streetList.remove(1));
		System.out.println(streetList.subList(0, 1));
		//streetList.clear();
		System.out.println(streetList);
		System.out.println(streetList.size());
		
		System.out.println("-----------------------------------");
		boolean remove=streetList.removeAll(streetList);
		System.out.println(remove);
		System.out.println(streetList);
		System.out.println("-----------------------------------");
		boolean contain=streetList.containsAll(streetList);
		System.out.println(contain);
		boolean retain=streetList.retainAll(streetList);
		System.out.println(retain);
		
		}

}
