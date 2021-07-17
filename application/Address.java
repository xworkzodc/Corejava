class Address{
	String street;
	int doorNo;
	Country country;
	
	Address(String street, int doorNo)
	{
		this.street=street;
		this.doorNo=doorNo;
	}
	
	void initCountry(Country country)
	{
		this.country=country;
	}
	
	void addressProperties()
	{
		System.out.println("Address street "+this.street);
		System.out.println("Address doorNo "+this.doorNo);
		if(this.country!=null)
		{
		this.country.countryProperties();
		}
	}
}

		