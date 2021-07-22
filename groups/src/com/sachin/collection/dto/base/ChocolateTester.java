package com.sachin.collection.dto.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ChocolateTester {

	public static void main(String[] args) {
		ChocolateDTO dto=new ChocolateDTO();
		dto.setBrand("dairymilk");
		dto.setCholesterol(true);
		dto.setColor("brown");
		dto.setGram(15.0d);
		dto.setMeltingTemp(30.0d);
		dto.setPrice(100);
		
		ChocolateDTO dto1=new ChocolateDTO("5star", 50, 20.0d, "brown", 30.0d, true);
		
		ChocolateDTO dto2=new ChocolateDTO("milkybar", 20, 10.0d, "white", 80.0d, true);
		
		Collection<ChocolateDTO> collection = new ArrayList<ChocolateDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		
		Iterator<ChocolateDTO> it = collection.iterator();
		while (it.hasNext()) {
			ChocolateDTO ref = it.next();
			System.out.println(ref);
			if(ref.getBrand().equals("5star") && ref.getColor().equals("brown")) {
				System.out.println("both are same");
			}
		}
		
		ChocolateDTO temp = new ChocolateDTO("Milkybar", 20, 10.0d, "white", 80.0d, true);
		boolean contain = collection.contains(temp);
		System.out.println(contain);
		
			}

	

}
