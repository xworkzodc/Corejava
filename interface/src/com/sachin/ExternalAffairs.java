package com.sachin;

public class ExternalAffairs {
	static final boolean PassportRule = false;
	private PassportRule rule;

	public ExternalAffairs() {
		System.out.println("created ExternalAffairs");
	}

	public void passportVerification() {
		if (rule != null) {
			System.out.println("rules exist can  exit");
			boolean deatilesMatch = this.rule.deatilsMatch();
			boolean indianCitizen = this.rule.indianCitizen();
			boolean criminalCase = this.rule.criminalCase();
			if (deatilesMatch == true && indianCitizen == true && criminalCase == false) {
				System.out.println("Verification success");

			} else {
				System.out.println("Verification not success");
			}
		} else {
			System.out.println("rules not exist");
		}

	}

	public void setRule(PassportRule rule) {
		this.rule = rule;
	}
}
