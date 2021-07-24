package com.sachin.game_service.dao;

import java.util.ArrayList;
import java.util.Collection;

import com.sachin.game_service.dto.GameDTO;

public class GameDAOImpl implements GameDAO{

	private Collection<GameDTO> coll = new ArrayList<GameDTO>();
	@Override
	public boolean save(GameDTO dto) {

		System.out.println("invoked save in dao");
		System.out.println(dto.hashCode());
		return this.coll.add(dto);
	}

	
}
