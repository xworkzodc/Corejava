package com.sachin;

public class Citizen implements PassportRule {

	private String name;
	private long mobileNo;
	
	public Citizen(String name,long mobileNo){
		this.name=name;
		this.mobileNo=mobileNo;
		
	}

	@Override
	public boolean deatilsMatch() {
		System.out.println(this.name + this.mobileNo +" deatilsMatch");
		return true;
	}

	@Override
	public boolean indianCitizen() {
		System.out.println(this.name + " is a indianCitizen;");
		return true;
	}

	@Override
	public boolean criminalCase() {
		System.out.println(this.name + " has no criminalCase");
		return false;
	}

}
