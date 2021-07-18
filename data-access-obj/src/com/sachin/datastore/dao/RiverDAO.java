package com.sachin.datastore.dao;

import com.sachin.datastore.dto.RiverDTO;

public interface RiverDAO {
	// CREATE READ UPDATE DELETE(CRUD)
	boolean save(RiverDTO dto);

	int totalItems();

	void update(RiverDTO dto);

	boolean delete(RiverDTO dto);

}
