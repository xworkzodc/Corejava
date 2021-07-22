package com.sachin;

public class VerificationTester {
	public static void main(String[] args) {
		PassportRule passportRule = new Citizen("Darshan",7996657688l);
		ExternalAffairs affairs = new ExternalAffairs();
		affairs.setRule(passportRule);
		affairs.passportVerification();

	}

}
