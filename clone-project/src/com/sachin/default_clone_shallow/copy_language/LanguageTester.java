package com.sachin.copy_language;

import com.sachin.copy_language.base.Language;

public class LanguageTester {

	public static void main(String[] args) {

		Language lang = new Language();
		lang.name = "Kannada";
		lang.region = "Karnataka";
		lang.old = 2500;

		lang.displayInfo();

		System.out.println("--------------");

		try {
			Language lang2 = (Language) lang.clone();
			System.out.println(lang2.name);
			System.out.println(lang2.region);
			System.out.println(lang2.old);
			lang2.name = "Telugu";
			lang2.region = "Andra Pradesh";

			System.out.println("-----------------");
			Language lang3 = (Language) lang2.clone();
			System.out.println(lang3.name);
			System.out.println(lang3.region);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
