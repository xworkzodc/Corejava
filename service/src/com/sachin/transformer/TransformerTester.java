package com.sachin.transformer;

import com.sachin.transformer.dto.TransformerDTO;
import com.sachin.transformer.service.TransformerService;
import com.sachin.transformer.service.TransformerServiceImpl;

public class TransformerTester {

	public static void main(String[] args) {

		TransformerDTO dto = new TransformerDTO("Sachin", "Honnali", "olle hudga", "aaproopa", "yavaglu", "Edeyalli kallu iddavanige idella aṇṭōdilla",
				"Playing cricket,watching movies ");

		TransformerService service = new TransformerServiceImpl();
		String saved = service.validatedAndSave(dto);
		System.out.println(saved);

		System.out.println(dto);
	}

}
