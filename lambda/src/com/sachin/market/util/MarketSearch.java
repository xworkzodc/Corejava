package com.sachin.market.util;

import com.sachin.market.dto.MarketDTO;

@FunctionalInterface
public interface MarketSearch {

	boolean test(MarketDTO dto);

}
