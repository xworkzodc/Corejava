class Application4{
	String name4;
	double version4;
	Developer4 developer4;
	
	Application4(String name4, double version4)
	{
		this.name4=name4;
		this.version4=version4;
	}
	
	void initDeveloper4(Developer4 developer4)
	{
		this.developer4=developer4;
	}
	
	void applicationProperties4()
	{
		System.out.println("Application name "+this.name4);
		System.out.println("Application version "+this.version4);
		if(this.developer4!=null)
		{
		this.developer4.developerProperties4();
		}
	}
	
	void displayDeveloperName4()
	{
		System.out.println("Developer name "+this.developer4.name4);
	}
	
	void displayDeveloperAddressSize4()
	{	
		System.out.println("Developer AddressSize "+this.developer4.addresses4.length);	
	}

	void displayDeveloperCountryStateSize4()
	{
		if(this.developer4.addresses4!=null)
		{
			for(int index=0; index<this.developer4.addresses4.length; index++)
			{
				Address4 addresses4=developer4.addresses4[index];
				String ref=addresses4.street4;
				Country4 country4=addresses4.country4;
				State4[] state4=country4.state4;
				System.out.println("StateSize " +state4.length);		
			}
		}
	}

	void displayDeveloperAddressStreet4()
	{
		if(this.developer4.addresses4!=null)
		{
			for(int index=0; index<this.developer4.addresses4.length; index++)
			{
				Address4 addresses4=developer4.addresses4[index];
				String street4=addresses4.street4;
				System.out.println("street "+street4);
			}
		}
	}
	
	void displayDeveloperCountry4()
	{
		if(this.developer4.addresses4!=null)
		{
			for(int index=0; index<this.developer4.addresses4.length; index++)
			{
				Address4 addresses4=developer4.addresses4[index];
				Country4 country4=addresses4.country4;
				System.out.println("country name "+country4.name4);
				System.out.println("country COde "+country4.code4);
			}
		}
	}
	
	void displayDeveloperCityName4()
	{
		if(this.developer4.addresses4!=null)
		{
			for(int index=0; index<this.developer4.addresses4.length; index++)
			{
				Address4 addresses4=developer4.addresses4[index];
				Country4 country4=addresses4.country4;
				State4[] state4=country4.state4;
				for(int i=0; i<state4.length; i++)	
				{ 
					State4 refstate4=state4[i];
					String capitalCity4=refstate4.capitalCity4;
					System.out.println(" city name"+capitalCity4);
				}
			}
		}
	}
}