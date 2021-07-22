package com.sachin.airport.checkin;

public class AirportCheckinImpl implements AirportCheckin {

	@Override
	public boolean collectBoardingPass(int tickets) {
		System.out.println("running collectBoardingPass method ");
		return true;
	}

	@Override
	public boolean cheackinAtBoardingPoint() {
		System.out.println("running cheackinAtBoardingPoint method ");
		return true;
	}

}
