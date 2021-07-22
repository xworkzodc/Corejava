package com.sachin;

public interface RelieveRule {
	int NOTICE_PERIOD_DAYS = 60;

	int servedNoticePeriod();

	boolean completedBond();

}