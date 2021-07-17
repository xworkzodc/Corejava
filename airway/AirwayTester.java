class AirwayTester{
public static void main(String[] args)
{
	Airway airway1= new Airway("Delhi","mangalore",36842);
	System.out.println(airway1.arrival);
	System.out.println(airway1.departure);
	System.out.println(airway1.flightNo);
	
	Airway airway2= new Airway();
	airway2=airway1;
	System.out.println(airway2.arrival);
	System.out.println(airway2.departure);
	System.out.println(airway2.flightNo);
}
}