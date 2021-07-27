package com.sachin.festival.dao;

import java.util.Collection;

import com.sachin.festival.dto.FestivalDTO;
import com.sachin.festival.util.FestivalSearch;

public interface FestivalDAO {

	boolean save(FestivalDTO dto);

	FestivalDTO findby(FestivalDTO festivalSearch);

	Collection<FestivalDTO> findAll(FestivalDTO festivalSearch);

}
