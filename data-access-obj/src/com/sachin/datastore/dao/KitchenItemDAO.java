package com.sachin.datastore.dao;

import java.util.Collection;

import com.sachin.datastore.dto.KitchenItemDTO;

public interface KitchenItemDAO {

	boolean saveUnique(KitchenItemDTO dto);

	Collection<KitchenItemDTO> findAllSortbyUsedFor();

	Collection<KitchenItemDTO> findAllSortbyUsedForDesc();

	Collection<KitchenItemDTO> findAllSortbyName();

	Collection<KitchenItemDTO> findAllSortbyPriceDesc();

}
