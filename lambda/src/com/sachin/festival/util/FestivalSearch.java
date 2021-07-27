package com.sachin.festival.util;

import com.sachin.festival.dto.FestivalDTO;

@FunctionalInterface
public interface FestivalSearch {

	boolean test(FestivalDTO dto);
}
