class ApplicationTester{
	
	public static void main(String[] args)
	{
		System.out.println("--------------------------------------------------------------");
		Application app=new Application("Instagram",191.37);
		Developer dev=new Developer("Sachin","sachingm.xworkz@gmail.com");
		Address address1=new Address("Rajajinagar 2nd cross ",181);
		Address address2=new Address("Basaveshwara nagar 1st A cross Road ",38);
		Country country1=new Country("India",560079);
		State state1=new State("California","San Francisco");
		State state2=new State("Karnataka","Bengaluru");
				
		app.initDeveloper(dev);	
		
		Address[] address={address1,address2};
		dev.initAddress(address);
		
		address1.initCountry(country1);
		address2.initCountry(country1);
		
		State[] state={state1,state2};
		country1.initState(state);
		
		app.applicationProperties();
		
		System.out.println("--------------------------------------------------------------");
		
		app.displayDeveloperName();
		app.displayDeveloperAddressSize();
		app.displayDeveloperCountryStateSize();
		app.displayDeveloperAddressStreet();
		app.displayDeveloperCountry();
		app.displayDeveloperCityName();
		
		
		System.out.println("--------------------------------------------------------------");
		
		
		
		
	}
}