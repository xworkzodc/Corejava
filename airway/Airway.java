class Airway
{
	String arrival;
	String departure;
	int flightNo;
	
	Airway(String newArrival, String newDeparture, int newFlightNo)
	{
		arrival=newArrival;
		System.out.println("Arrival : "+newArrival);
		departure=newDeparture;
		System.out.println("Departure : "+newDeparture);
		flightNo=newFlightNo;
		System.out.println("FlightNo: "+newFlightNo);
	}
	
	Airway()
	{
		System.out.println("Arrival : "+arrival);
		System.out.println("Departure : "+departure);
		System.out.println("FlightNo: "+flightNo);
	}
}
