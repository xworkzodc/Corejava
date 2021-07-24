package com.sachin.fish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.sachin.fish.dto.FishDTO;

public class FishTester {

	public static void main(String[] args) {

		FishDTO dto = new FishDTO("Mandarinfish", "orange", "SaltwaterFish", 2, 1000, "male");
		FishDTO dto1 = new FishDTO("Flowerhorn Cichild", "blue", "UniqueFish", 6, 3000, "female");
		FishDTO dto2 = new FishDTO("Discus", "red", "freshwaterFish", 8, 1500, "female");
		FishDTO dto3 = new FishDTO("Clownfish", "yellow", "colorfulFish", 4, 5000, "male");

		List<FishDTO> collection = new ArrayList<FishDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);

		Comparator<FishDTO> fishName = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		Collections.sort(collection, fishName);
		Iterator<FishDTO> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			FishDTO fishDetails = (FishDTO) itr1.next();
			System.out.println("name " + fishDetails.getName());
		}

		Comparator<FishDTO> fishColor = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o1.getColor().compareTo(o2.getColor());
			}
		};
		Collections.sort(collection, fishColor);
		Iterator<FishDTO> itr2 = collection.iterator();
		while (itr2.hasNext()) {
			FishDTO fishDetails = (FishDTO) itr2.next();
			System.out.println("color " + fishDetails.getColor());
		}

		Comparator<FishDTO> fishNameDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};

		Collections.sort(collection, fishNameDesc);
		Iterator<FishDTO> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			FishDTO fishDetails = (FishDTO) itr3.next();
			System.out.println("name in desc  " + fishDetails.getName());
		}

		Comparator<FishDTO> fishLifeSpan = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				if (o1.getLifeSpan() == o2.getLifeSpan())
					return 0;
				else if (o1.getLifeSpan() > o2.getLifeSpan())
					return 1;
				else
					return -1;
			}

		};

		Collections.sort(collection, fishLifeSpan);

		Iterator<FishDTO> itr4 = collection.iterator();
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("LifeSpan : " + fishDTO.getLifeSpan());

		}

		Comparator<FishDTO> lifeSpanDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				if (o2.getLifeSpan() == o1.getLifeSpan())
					return 0;
				else if (o2.getLifeSpan() > o1.getLifeSpan())
					return -1;
				else

					return 1;
			}
		};

		Collections.sort(collection, lifeSpanDesc.reversed());

		Iterator itr5 = collection.iterator();
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("Life Span Desc : " + fishDTO.getLifeSpan());

		}

		Comparator<FishDTO> fishcostDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				if (o2.getCost() == o1.getCost())
					return 0;
				else if (o2.getCost() > o1.getCost())
					return -1;
				else
					return 1;
			}

		};

		Collections.sort(collection, fishcostDesc.reversed());

		Iterator itr6 = collection.iterator();
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("FishCost Desc : " + fishDTO.getCost());
		}

	}

}
