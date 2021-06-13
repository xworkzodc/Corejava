class Address3{
	String street3;
	int doorNo3;
	Country3 country3;
	
	Address3(String street3, int doorNo3)
	{
		this.street3=street3;
		this.doorNo3=doorNo3;
	}
	
	void initCountry3(Country3 country3)
	{
		this.country3=country3;
	}
	
	void addressProperties3()
	{
		System.out.println("Address street "+this.street3);
		System.out.println("Address doorNo "+this.doorNo3);
		if(this.country3!=null)
		{
		this.country3.countryProperties3();
		}
	}
}

		