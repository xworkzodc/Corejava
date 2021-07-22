package com.sachin.dto.televisiondto;

import com.sachin.dto.televisiondto.base.TelevisionDTO;

public class TelevisionTester {

	public static void main(String[] args) {

		TelevisionDTO television = new TelevisionDTO();
		television.setBrand("Onida");
		television.setPrice(15000);
		television.setSmart(false);

		System.out.println(television);

	}

}
