class StreetTester
{
	public static void main(String[] args)
	{
		Street street1= new Street(Street.City.MYSORE);			
		street1.updateAreaName("Mysore Road");
		street1.updateStreetType();
		street1.printAllInstanceVariable();
		
		Street street2= new Street(Street.City.MANGALORE);			
		street2.updateAreaName("Chickpet");
		street2.updateStreetType();
		street2.printAllInstanceVariable();
		
		Street street3= new Street(Street.City.SHIVAMOGGA);			
		street3.updateAreaName("MG Road");
		street3.updateStreetType();
		street3.printAllInstanceVariable();
		
		Street street4= new Street(Street.City.DAVANAGERE);			
		street4.updateAreaName("Nehru Road");
		street4.updateStreetType();
		street4.printAllInstanceVariable();
	}
}