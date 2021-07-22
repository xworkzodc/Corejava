package com.sachin.collection.dto.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.sachin.collection.dto.constant.OilColor;
import com.sachin.collection.dto.constant.OilType;

public class OilTester {

	public static void main(String[] args) {
		OilDTO dto = new OilDTO();
		dto.setBrand("Goldwinner");
		dto.setPrice(170d);
		dto.setType(OilType.ALMOND);
		dto.setColor(OilColor.GOLD);
		dto.setQuantity(true);
		dto.setUsedforcook(false);
		dto.setQuantity(true);
		dto.setViscosity(90d);

		OilDTO dto1 = new OilDTO("Jasmine", 220d, OilType.COCONUT, OilColor.WHITE, true, true, true, 85d);

		OilDTO dto2 = new OilDTO("Dabur", 120d, OilType.NAVARTANA, OilColor.RED, true, false, true, 75d);

		Collection<OilDTO> collection = new ArrayList<OilDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);

		Iterator<OilDTO> it = collection.iterator();
		while (it.hasNext()) {
			OilDTO ref = it.next();
			System.out.println(ref);
			if (ref.getBrand().equals("Jasmine") && ref.getPrice() > 200) {
				System.out.println("oil price is high");
			}
		}
		OilDTO temp = new OilDTO("Gold", 160d, OilType.SUNFLOWER, OilColor.BROWN, true, true, true, 95d);
		boolean contain = collection.contains(temp);
		System.out.println(contain);

	}



}
