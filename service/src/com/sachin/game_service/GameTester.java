package com.sachin.game_service;

import com.sachin.game_service.dto.GameDTO;
import com.sachin.game_service.service.GameService;
import com.sachin.game_service.service.GameServiceImpl;

public class GameTester {
	
	public static void main(String[] args) {
		

		GameDTO dto = new GameDTO("BGMI", "10.0", "KRAFTON", 100, 20000, true);
		
		 GameService gameservice = new GameServiceImpl();
		 String saved = gameservice.validateAndSave(dto);
		 System.out.println(saved);
		 
		 System.out.println(dto);

	}

}
