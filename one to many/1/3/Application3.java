class Application3{
	String name3;
	double version3;
	Developer3 developer3;
	
	Application3(String name3, double version3)
	{
		this.name3=name3;
		this.version3=version3;
	}
	
	void initDeveloper3(Developer3 developer3)
	{
		this.developer3=developer3;
	}
	
	void applicationProperties3()
	{
		System.out.println("Application name "+this.name3);
		System.out.println("Application version "+this.version3);
		if(this.developer3!=null)
		{
		this.developer3.developerProperties3();
		}
	}
	
	void displayDeveloperName3()
	{
		System.out.println("Developer name "+this.developer3.name3);
	}
	
	void displayDeveloperAddressSize3()
	{	
		System.out.println("Developer AddressSize "+this.developer3.addresses3.length);	
	}

	void displayDeveloperCountryStateSize3()
	{
		if(this.developer3.addresses3!=null)
		{
			for(int index=0; index<this.developer3.addresses3.length; index++)
			{
				Address3 addresses3=developer3.addresses3[index];
				String ref=addresses3.street3;
				Country3 country3=addresses3.country3;
				State3[] state3=country3.state3;
				System.out.println("StateSize " +state3.length);		
			}
		}
	}

	void displayDeveloperAddressStreet3()
	{
		if(this.developer3.addresses3!=null)
		{
			for(int index=0; index<this.developer3.addresses3.length; index++)
			{
				Address3 addresses3=developer3.addresses3[index];
				String street3=addresses3.street3;
				System.out.println("street "+street3);
			}
		}
	}
	
	void displayDeveloperCountry3()
	{
		if(this.developer3.addresses3!=null)
		{
			for(int index=0; index<this.developer3.addresses3.length; index++)
			{
				Address3 addresses3=developer3.addresses3[index];
				Country3 country3=addresses3.country3;
				System.out.println("country name "+country3.name3);
				System.out.println("country COde "+country3.code3);
			}
		}
	}
	
	void displayDeveloperCityName3()
	{
		if(this.developer3.addresses3!=null)
		{
			for(int index=0; index<this.developer3.addresses3.length; index++)
			{
				Address3 addresses3=developer3.addresses3[index];
				Country3 country3=addresses3.country3;
				State3[] state3=country3.state3;
				for(int i=0; i<state3.length; i++)	
				{ 
					State3 refstate3=state3[i];
					String capitalCity3=refstate3.capitalCity3;
					System.out.println(" city name"+capitalCity3);
				}
			}
		}
	}
}