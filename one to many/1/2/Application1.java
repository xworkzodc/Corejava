class Application1{
	String name1;
	double version1;
	Developer1 developer1;
	
	Application1(String name1, double version1)
	{
		this.name1=name1;
		this.version1=version1;
	}
	
	void initDeveloper1(Developer1 developer1)
	{
		this.developer1=developer1;
	}
	
	void applicationProperties1()
	{
		System.out.println("Application name "+this.name1);
		System.out.println("Application version "+this.version1);
		if(this.developer1!=null)
		{
		this.developer1.developerProperties1();
		}
	}
	
	void displayDeveloperName1()
	{
		System.out.println("Developer name "+this.developer1.name1);
	}
	
	void displayDeveloperAddressSize1()
	{	
		System.out.println("Developer AddressSize "+this.developer1.addresses1.length);	
	}

	void displayDeveloperCountryStateSize1()
	{
		if(this.developer1.addresses1!=null)
		{
			for(int index=0; index<this.developer1.addresses1.length; index++)
			{
				Address1 addresses1=developer1.addresses1[index];
				String ref=addresses1.street1;
				Country1 country1=addresses1.country1;
				State1[] state1=country1.state1;
				System.out.println("StateSize " +state1.length);		
			}
		}
	}

	void displayDeveloperAddressStreet1()
	{
		if(this.developer1.addresses1!=null)
		{
			for(int index=0; index<this.developer1.addresses1.length; index++)
			{
				Address1 addresses1=developer1.addresses1[index];
				String street1=addresses1.street1;
				System.out.println("street "+street1);
			}
		}
	}
	
	void displayDeveloperCountry1()
	{
		if(this.developer1.addresses1!=null)
		{
			for(int index=0; index<this.developer1.addresses1.length; index++)
			{
				Address1 addresses1=developer1.addresses1[index];
				Country1 country1=addresses1.country1;
				System.out.println("country name "+country1.name1);
				System.out.println("country COde "+country1.code1);
			}
		}
	}
	
	void displayDeveloperCityName1()
	{
		if(this.developer1.addresses1!=null)
		{
			for(int index=0; index<this.developer1.addresses1.length; index++)
			{
				Address1 addresses1=developer1.addresses1[index];
				Country1 country1=addresses1.country1;
				State1[] state1=country1.state1;
				for(int i=0; i<state1.length; i++)	
				{ 
					State1 refstate1=state1[i];
					String capitalCity1=refstate1.capitalCity1;
					System.out.println(" city name"+capitalCity1);
				}
			}
		}
	}
}