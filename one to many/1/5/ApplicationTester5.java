class ApplicationTester5{
	
	public static void main(String[] args)
	{
		System.out.println("--------------------------------------------------------------");
		Application5 app=new Application5("Instagram",595.37);
		Developer5 dev=new Developer5("Sachin","sachingm.xworkz@gmail.com");
		Address5 address1=new Address5("Rajajinagar 2nd cross ",585);
		Address5 address2=new Address5("Basaveshwara nagar 5st A cross Road ",38);
		Country5 country5=new Country5("India",560079);
		State5 state1=new State5("California","San Francisco");
		State5 state2=new State5("Karnataka","Bengaluru");
				
		app.initDeveloper5(dev);	
		
		Address5[] address={address1,address2};
		dev.initAddress5(address);
		
		address1.initCountry5(country5);
		address2.initCountry5(country5);
		
		State5[] state={state1,state2};
		country5.initState5(state);
		
		app.applicationProperties5();
		
		System.out.println("--------------------------------------------------------------");
		
		app.displayDeveloperName5();
		app.displayDeveloperAddressSize5();
		app.displayDeveloperCountryStateSize5();
		app.displayDeveloperAddressStreet5();
		app.displayDeveloperCountry5();
		app.displayDeveloperCityName5();
		
		
		System.out.println("--------------------------------------------------------------");
		
		
		
		
	}
}