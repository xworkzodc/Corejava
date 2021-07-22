package com.sachin.airport;

import com.sachin.airport.checkin.AirportCheckin;
import com.sachin.airport.checkin.AirportCheckinImpl;

public class AirportCheckinTester {

	public static void main(String[] args) {
		AirportCheckin airportCheckin = new AirportCheckinImpl();
		System.out.println("lugguage weight " + AirportCheckin.LUGGUAGE_WEIGHT);
		airportCheckin.collectBoardingPass(8);
		airportCheckin.cheackinAtBoardingPoint();

	}

}
