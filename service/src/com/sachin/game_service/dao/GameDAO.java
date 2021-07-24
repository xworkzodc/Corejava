package com.sachin.game_service.dao;

import com.sachin.game_service.dto.GameDTO;

public interface GameDAO {
	
	boolean save(GameDTO dto);

}
