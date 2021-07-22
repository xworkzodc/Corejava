package com.sachin;

public class Developer implements RelieveRule {
	private String name;
	
	 public Developer(String name){
		this.name=name;
		
	}
	

	@Override
	public boolean completedBond() {
		System.out.println(this.name + " completed Bond");
		return true;
	}

	@Override
	public int servedNoticePeriod() {
		System.out.println(this.name + " served notice period");
		return 60;
	}

}