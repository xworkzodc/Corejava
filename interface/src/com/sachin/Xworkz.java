package com.sachin;

public class Xworkz {
	private RelieveRule rule;

	public Xworkz() {
		System.out.println("created xworkz");
	}

	public void employeeExit() {
		if (rule != null) {
			System.out.println("rules exist can  exit");
			boolean complete = this.rule.completedBond();
			int period = this.rule.servedNoticePeriod();
			if (complete && period >= RelieveRule.NOTICE_PERIOD_DAYS) {
				System.out.println("employee can exit now");
			} else {
				System.out.println("employee cannot exit ,rules not followed");
			}
		} else {
			System.out.println("rules not exist");
		}
	}

	public void setRule(RelieveRule rule) {
		this.rule = rule;
	}

}