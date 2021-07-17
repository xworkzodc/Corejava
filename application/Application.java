class Application{
	String name;
	double version;
	Developer developer;
	
	Application(String name, double version)
	{
		this.name=name;
		this.version=version;
	}
	
	void initDeveloper(Developer developer)
	{
		this.developer=developer;
	}
	
	void applicationProperties()
	{
		System.out.println("Application name "+this.name);
		System.out.println("Application version "+this.version);
		if(this.developer!=null)
		{
		this.developer.developerProperties();
		}
	}
	
	void displayDeveloperName()
	{
		System.out.println("Developer name "+this.developer.name);
	}
	
	void displayDeveloperAddressSize()
	{	
		System.out.println("Developer AddressSize "+this.developer.addresses.length);	
	}

	void displayDeveloperCountryStateSize()
	{
		if(this.developer.addresses!=null)
		{
			for(int index=0; index<this.developer.addresses.length; index++)
			{
				Address addresses=developer.addresses[index];
				String ref=addresses.street;
				Country country=addresses.country;
				State[] state=country.state;
				System.out.println("StateSize " +state.length);		
			}
		}
	}

	void displayDeveloperAddressStreet()
	{
		if(this.developer.addresses!=null)
		{
			for(int index=0; index<this.developer.addresses.length; index++)
			{
				Address addresses=developer.addresses[index];
				String street=addresses.street;
				System.out.println("street "+street);
			}
		}
	}
	
	void displayDeveloperCountry()
	{
		if(this.developer.addresses!=null)
		{
			for(int index=0; index<this.developer.addresses.length; index++)
			{
				Address addresses=developer.addresses[index];
				Country country=addresses.country;
				System.out.println("country name "+country.name);
				System.out.println("country COde "+country.code);
			}
		}
	}
	
	void displayDeveloperCityName()
	{
		if(this.developer.addresses!=null)
		{
			for(int index=0; index<this.developer.addresses.length; index++)
			{
				Address addresses=developer.addresses[index];
				Country country=addresses.country;
				State[] state=country.state;
				for(int i=0; i<state.length; i++)	
				{ 
					State refstate=state[i];
					String capitalCity=refstate.capitalCity;
					System.out.println(" city name"+capitalCity);
				}
			}
		}
	}
}