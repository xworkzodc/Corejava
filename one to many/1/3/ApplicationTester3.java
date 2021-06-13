class ApplicationTester3{
	
	public static void main(String[] args)
	{
		System.out.println("--------------------------------------------------------------");
		Application3 app=new Application3("Instagram",191.37);
		Developer3 dev=new Developer3("Sachin","sachingm.xworkz@gmail.com");
		Address3 address1=new Address3("Rajajinagar 2nd cross ",181);
		Address3 address2=new Address3("Basaveshwara nagar 1st A cross Road ",38);
		Country3 country1=new Country3("India",560079);
		State3 state1=new State3("California","San Francisco");
		State3 state2=new State3("Karnataka","Bengaluru");
				
		app.initDeveloper3(dev);	
		
		Address3[] address={address1,address2};
		dev.initAddress3(address);
		
		address1.initCountry3(country1);
		address2.initCountry3(country1);
		
		State3[] state={state1,state2};
		country1.initState3(state);
		
		app.applicationProperties3();
		
		System.out.println("--------------------------------------------------------------");
		
		app.displayDeveloperName3();
		app.displayDeveloperAddressSize3();
		app.displayDeveloperCountryStateSize3();
		app.displayDeveloperAddressStreet3();
		app.displayDeveloperCountry3();
		app.displayDeveloperCityName3();
		
		
		System.out.println("--------------------------------------------------------------");
		
		
		
		
	}
}