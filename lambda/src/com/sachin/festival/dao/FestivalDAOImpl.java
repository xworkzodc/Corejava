package com.sachin.festival.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import com.sachin.festival.constant.ReligionType;
import com.sachin.festival.dto.FestivalDTO;
import com.sachin.festival.util.FestivalSearch;

public class FestivalDAOImpl implements FestivalDAO {

	private Collection<FestivalDTO> collection = new ArrayList<>();

	public FestivalDAOImpl() {

		
	}

	@Override
	public boolean save(FestivalDTO dto) {
		boolean added = collection.add(dto);
		System.out.println("dto " + dto);
		System.out.println("dto was added " + added);
		return added;
	}

	@Override
	public FestivalDTO findby(FestivalDTO festivalSearch) {
		collection.forEach((a)-> System.out.println(a));;
		return festivalSearch;

	}

	@Override
	public Collection<FestivalDTO> findAll(FestivalDTO festivalSearch) {
		collection.forEach((a)->System.out.println(a));
		return collection;
	}

}
