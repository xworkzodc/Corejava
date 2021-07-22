package com.sachin.game_service.service;

import com.sachin.game_service.dto.GameDTO;

public class GameServiceImpl implements GameService {

	@Override
	public String validateAndSave(GameDTO dto) {
		boolean nameValid = false;
		boolean versionValid = false;
		boolean developedByValid = false;
		boolean maxPlayersValid = false;
		boolean memoryRequiredValid = false;

		if (dto != null) {
			System.out.println("dto is not null,will start validating");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 40) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name invalid");
				nameValid = false;
			}

			String version = dto.getVersion();
			if (version != null && version.length() > 1 && version.length() < 50) {
				System.out.println("version is valid");
				versionValid = true;
			} else {
				System.out.println("version is invalid");
				versionValid = false;
			}

			String developeBy = dto.getDevelopedBy();
			if (developeBy != null && developeBy.length() >= 3 && developeBy.length() <= 15) {
				System.out.println("developed by is valid");
				developedByValid = true;
			} else {
				System.out.println("developedBy is not valid");
				developedByValid = false;
			}
			int maxplayer = dto.getMaxPlayers();
			if (maxplayer != 0 && maxplayer >= 1 && maxplayer <= 100) {
				System.out.println("MaxPlayer is valid");
				maxPlayersValid = true;
			} else {
				System.out.println("maxplayer is not valid");
				maxPlayersValid = false;
			}

			double memoryRequired = dto.getMemoryRequired();
			if (memoryRequired != 0 && memoryRequired >= 1000 && memoryRequired <= 40000) {
				System.out.println("memoryRequired is valid");
				memoryRequiredValid = true;
			} else {
				System.out.println("memoryRequired is not valid");
				memoryRequiredValid = false;
			}

			if (nameValid && versionValid && developedByValid && maxPlayersValid && memoryRequiredValid) {
				System.out.println("data is valid,returing success");
				return "Success";
			}
			return "FAILED";
		}
		System.out.println("dto is null, cannot pass to dto");
		return "FAILED";
	}

}
