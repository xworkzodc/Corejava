package com.sachin.map.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AadharMapTester {

	public static void main(String[] args) {

		Map<Long, Long> adharMobile = new HashMap<Long, Long>();

		adharMobile.put(123456789012l, 9445554565l);
		adharMobile.put(908768909890l, 7887544445l);
		adharMobile.put(121231344545l, 8978789877l);
		adharMobile.put(235434545455l, 9877686778l);
		adharMobile.put(677898788888l, 9856776777l);
		adharMobile.put(467897667777l, 96456555678l);

		System.out.println(adharMobile.size());
		System.out.println("--------------");
		System.out.println(adharMobile.containsKey(121231344545l));
		System.out.println("--------------");
		System.out.println(adharMobile.containsValue(9877686778l));
		System.out.println("--------------");

		Set<Long> keyset = adharMobile.keySet();
		Collection<Long> values = adharMobile.values();
		System.out.println("MobileNumber ");
		Iterator<Long> itrValue = values.iterator();
		while (itrValue.hasNext()) {
			long mobile = itrValue.next();
			System.out.println(mobile);
		}
		System.out.println("--------------");
		System.out.println("Adhar Number ");
		Iterator<Long> itrvalue = keyset.iterator();
		while (itrvalue.hasNext()) {
			Long adhar = itrvalue.next();
			System.out.println(adhar);
		}
		System.out.println("--------------");
		System.out.println("AdharNumber and MobileNumber ");
		Iterator<Long> itr = keyset.iterator();
		while (itr.hasNext()) {
			Long string = itr.next();
			Long value = adharMobile.get(string);
			System.out.println(string + " " + value);
		}
		System.out.println("--------------");
		adharMobile.remove(121231344545l);
		System.out.println(adharMobile.size());
	}

}
