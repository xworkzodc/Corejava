class TravelAgencyTester{
public static void main(String[] args)
{

TravelAgency.displayAgencies();
TravelAgency.addAgency("VRL");
TravelAgency.addAgency("SRS");
TravelAgency.addAgency("Red Bus");
TravelAgency.addAgency("Orange");
TravelAgency.addAgency("MArco Polo");

TravelAgency.displayAgencies();
TravelAgency.displayAgencyAtIndex(2);
TravelAgency.printFoundIfAgency("Orange");
}
}