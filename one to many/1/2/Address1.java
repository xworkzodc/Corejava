class Address1{
	String street1;
	int doorNo1;
	Country1 country1;
	
	Address1(String street1, int doorNo1)
	{
		this.street1=street1;
		this.doorNo1=doorNo1;
	}
	
	void initCountry1(Country1 country1)
	{
		this.country1=country1;
	}
	
	void addressProperties1()
	{
		System.out.println("Address street "+this.street1);
		System.out.println("Address doorNo "+this.doorNo1);
		if(this.country1!=null)
		{
		this.country1.countryProperties1();
		}
	}
}

		