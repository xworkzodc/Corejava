package com.sachin.map.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GovtMapTester {

	public static void main(String[] args) {
		Map<String, Double> govtOfficial = new HashMap<String, Double>();
		govtOfficial.put("SI", 100000d);
		govtOfficial.put("IPS", 200000d);
		govtOfficial.put("cheif Minister", 300000d);
		govtOfficial.put("IAS", 400000d);

		System.out.println(govtOfficial.size());
		System.out.println("----------------");
		System.out.println(govtOfficial.containsKey("SI"));
		System.out.println("----------------");
		System.out.println(govtOfficial.containsValue(300000d));
		System.out.println("----------------");

		Set<String> keyset = govtOfficial.keySet();
		Collection<Double> values = govtOfficial.values();

		System.out.println("Salary");
		Iterator<Double> itrValue = values.iterator();
		while (itrValue.hasNext()) {
			Double salary = itrValue.next();
			System.out.println(salary);
		}

		System.out.println("----------------");
		System.out.println("Govt Official");
		Iterator<String> itrvalue = keyset.iterator();
		while (itrvalue.hasNext()) {
			String stringvalue = itrvalue.next();
			System.out.println(stringvalue);
		}
		System.out.println("----------------");
		System.out.println("Govt Official and Salary");
		Iterator<String> itr = keyset.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			Double value = govtOfficial.get(string);
			System.out.println(string + " " + value);
		}
		System.out.println("----------------");
		govtOfficial.remove("IPS");
		System.out.println(govtOfficial.size());
	}

}
