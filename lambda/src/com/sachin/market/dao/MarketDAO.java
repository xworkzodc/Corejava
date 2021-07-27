package com.sachin.market.dao;

import java.util.Collection;

import com.sachin.market.dto.MarketDTO;
import com.sachin.market.util.MarketSearch;

public interface MarketDAO {

	MarketDTO findby(MarketSearch marketSearch);

	Collection<MarketDTO> findAll(MarketSearch marketSearch);

}
