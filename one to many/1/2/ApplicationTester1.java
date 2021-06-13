class ApplicationTester1{
	
	public static void main(String[] args)
	{
		System.out.println("--------------------------------------------------------------");
		Application1 app=new Application1("Instagram",191.37);
		Developer1 dev=new Developer1("Sachin","sachingm.xworkz@gmail.com");
		Address1 address1=new Address1("Rajajinagar 2nd cross ",181);
		Address1 address2=new Address1("Basaveshwara nagar 1st A cross Road ",38);
		Country1 country1=new Country1("India",560079);
		State1 state1=new State1("California","San Francisco");
		State1 state2=new State1("Karnataka","Bengaluru");
				
		app.initDeveloper1(dev);	
		
		Address1[] address={address1,address2};
		dev.initAddress1(address);
		
		address1.initCountry1(country1);
		address2.initCountry1(country1);
		
		State1[] state={state1,state2};
		country1.initState1(state);
		
		app.applicationProperties1();
		
		System.out.println("--------------------------------------------------------------");
		
		app.displayDeveloperName1();
		app.displayDeveloperAddressSize1();
		app.displayDeveloperCountryStateSize1();
		app.displayDeveloperAddressStreet1();
		app.displayDeveloperCountry1();
		app.displayDeveloperCityName1();
		
		
		System.out.println("--------------------------------------------------------------");
		
		
		
		
	}
}