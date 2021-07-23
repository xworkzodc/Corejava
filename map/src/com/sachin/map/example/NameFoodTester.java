package com.sachin.map.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NameFoodTester {

	public static void main(String[] args) {

		Map<String, String> nameFood = new HashMap<String, String>();

		nameFood.put("sanvi", "dosa");
		nameFood.put("janvi", "Panipuri");
		nameFood.put("preethi", "gobi");
		nameFood.put("janani", "Egg puff");
		nameFood.put("suhana", "Chicken");	 
			
			System.out.println(nameFood.size());
			System.out.println("------------------");
			System.out.println(nameFood.containsKey("janani"));
			System.out.println("-------------------");
			System.out.println(nameFood.containsValue("chicken"));
			System.out.println("-----------------------");

			Set<String> keyset = nameFood.keySet();
			Collection<String> values = nameFood.values();

			System.out.println("Food");
			Iterator<String> itrValue = values.iterator();
			while (itrValue.hasNext()) {
				String str = itrValue.next();
				System.out.println(str);
			}
			System.out.println("----------------");
			System.out.println("Name");
			Iterator<String> itrvalue = keyset.iterator();
			while (itrvalue.hasNext()) {
				String stringvalue = itrvalue.next();
				System.out.println(stringvalue);
			}
			System.out.println("----------------------");
			System.out.println("Name & Food ");
			Iterator<String> itr = keyset.iterator();
			while (itr.hasNext()) {
				String string = itr.next();
				String value = nameFood.get(string);
				System.out.println(string + " " + value);
			}
			System.out.println("------------------------");
			nameFood.remove("janvi");
			System.out.println(nameFood.size());

	}

}
