package com.sachin.dto.messagedto.base;

import java.io.Serializable;

public class MessageDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1641512082144614504L;
	private String sender;
	private String receiver;
	private String time;

	public MessageDTO() {
		System.out.println("invoked messageDTO");
	}

	public MessageDTO(String sender, String receiver, String time) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.time = time;
	}

	@Override
	public String toString() {
		return "MessageDTO [sender=" + sender + ", receiver=" + receiver + ", time=" + time + "]";
	}

}
