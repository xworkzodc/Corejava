package com.sachin.dto.messagedto;

import com.sachin.dto.messagedto.base.MessageDTO;

public class MessageTester {

	public static void main(String[] args) {
		MessageDTO message = new MessageDTO("sachin", "Darshan", "10.00pm");
		System.out.println(message);

	}

}
