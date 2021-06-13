class Application5{
	String name5;
	double version5;
	Developer5 developer5;
	
	Application5(String name5, double version5)
	{
		this.name5=name5;
		this.version5=version5;
	}
	
	void initDeveloper5(Developer5 developer5)
	{
		this.developer5=developer5;
	}
	
	void applicationProperties5()
	{
		System.out.println("Application name "+this.name5);
		System.out.println("Application version "+this.version5);
		if(this.developer5!=null)
		{
		this.developer5.developerProperties5();
		}
	}
	
	void displayDeveloperName5()
	{
		System.out.println("Developer name "+this.developer5.name5);
	}
	
	void displayDeveloperAddressSize5()
	{	
		System.out.println("Developer AddressSize "+this.developer5.addresses5.length);	
	}

	void displayDeveloperCountryStateSize5()
	{
		if(this.developer5.addresses5!=null)
		{
			for(int index=0; index<this.developer5.addresses5.length; index++)
			{
				Address5 addresses5=developer5.addresses5[index];
				String ref=addresses5.street5;
				Country5 country5=addresses5.country5;
				State5[] state5=country5.state5;
				System.out.println("StateSize " +state5.length);		
			}
		}
	}

	void displayDeveloperAddressStreet5()
	{
		if(this.developer5.addresses5!=null)
		{
			for(int index=0; index<this.developer5.addresses5.length; index++)
			{
				Address5 addresses5=developer5.addresses5[index];
				String street5=addresses5.street5;
				System.out.println("street "+street5);
			}
		}
	}
	
	void displayDeveloperCountry5()
	{
		if(this.developer5.addresses5!=null)
		{
			for(int index=0; index<this.developer5.addresses5.length; index++)
			{
				Address5 addresses5=developer5.addresses5[index];
				Country5 country5=addresses5.country5;
				System.out.println("country name "+country5.name5);
				System.out.println("country COde "+country5.code5);
			}
		}
	}
	
	void displayDeveloperCityName5()
	{
		if(this.developer5.addresses5!=null)
		{
			for(int index=0; index<this.developer5.addresses5.length; index++)
			{
				Address5 addresses5=developer5.addresses5[index];
				Country5 country5=addresses5.country5;
				State5[] state5=country5.state5;
				for(int i=0; i<state5.length; i++)	
				{ 
					State5 refstate5=state5[i];
					String capitalCity5=refstate5.capitalCity5;
					System.out.println(" city name"+capitalCity5);
				}
			}
		}
	}
}