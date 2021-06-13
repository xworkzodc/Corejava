class ApplicationTester4{
	
	public static void main(String[] args)
	{
		System.out.println("--------------------------------------------------------------");
		Application4 app=new Application4("Instagram",494.37);
		Developer4 dev=new Developer4("Sachin","sachingm.xworkz@gmail.com");
		Address4 address1=new Address4("Rajajinagar 2nd cross ",484);
		Address4 address2=new Address4("Basaveshwara nagar 4st A cross Road ",38);
		Country4 country4=new Country4("India",560079);
		State4 state1=new State4("California","San Francisco");
		State4 state2=new State4("Karnataka","Bengaluru");
				
		app.initDeveloper4(dev);	
		
		Address4[] address={address1,address2};
		dev.initAddress4(address);
		
		address1.initCountry4(country4);
		address2.initCountry4(country4);
		
		State4[] state={state1,state2};
		country4.initState4(state);
		
		app.applicationProperties4();
		
		System.out.println("--------------------------------------------------------------");
		
		app.displayDeveloperName4();
		app.displayDeveloperAddressSize4();
		app.displayDeveloperCountryStateSize4();
		app.displayDeveloperAddressStreet4();
		app.displayDeveloperCountry4();
		app.displayDeveloperCityName4();
		
		
		System.out.println("--------------------------------------------------------------");
		
		
		
		
	}
}