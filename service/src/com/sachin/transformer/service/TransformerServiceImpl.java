package com.sachin.transformer.service;

import com.sachin.transformer.dto.TransformerDTO;

public class TransformerServiceImpl implements TransformerService {

	@Override
	public String validatedAndSave(TransformerDTO dto) {
		boolean namevalid = false;
		boolean placevalid = false;
		boolean angryValid = false;
		boolean happyValid = false;
		boolean sadValid = false;
		boolean likeToDoValid = false;

		if (dto != null) {
			System.out.println("DTO is not null , will start validation");

			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 50) {
				System.out.println("Name is valid");
				namevalid = true;
			} else {
				System.out.println("Name is not valid");
				namevalid = false;
			}

			String place = dto.getPlace();
			if (place != null && !place.isEmpty() && place.length() >= 4 && place.length() <= 20) {
				System.out.println("Place is valid");
				placevalid = true;
			} else {
				System.out.println("Place is Not valid");
				placevalid = false;
			}

			String angry = dto.getAngry();
			if (angry != null && !angry.isEmpty() && angry.length() >= 4 && angry.length() <= 12) {
				System.out.println("Angry is valid");
				angryValid = true;
			} else {
				System.out.println("Angry is not valid");
				angryValid = false;
			}

			String happy = dto.getHappy();
			if (happy != null && !happy.isEmpty() && happy.length() >= 4 && happy.length() <= 12) {
				System.out.println("Happy is valid");
				happyValid = true;
			} else {
				System.out.println("Happy is not valid");
				happyValid = false;
			}

			String sad = dto.getSad();
			if (sad != null && !sad.isEmpty() && sad.length() >= 4 && sad.length() <= 120) {
				System.out.println("Sad is valid");
				sadValid = true;
			} else {
				System.out.println("Sad is not valid");
				sadValid = false;
			}

			String likeToDo = dto.getLikeToDo();
			if (likeToDo != null && !likeToDo.isEmpty() && likeToDo.length() >= 15 && likeToDo.length() <= 300) {
				System.out.println("likeToDo is valid");
				likeToDoValid = true;
			} else {
				System.out.println("likeToDo is not valid");
				likeToDoValid = false;
			}

			if (namevalid && placevalid && angryValid && happyValid && sadValid && likeToDoValid) {
				System.out.println("data is valid ");
				return "Success";
			}
			return "FAILURE";
		}
		System.out.println("dto is null, cannot pass to dto");
		return "FAILURE";
	}
}
