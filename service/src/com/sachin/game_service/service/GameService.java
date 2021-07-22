package com.sachin.game_service.service;

import com.sachin.game_service.dto.GameDTO;

public interface GameService {

	String validateAndSave(GameDTO dto);

}
