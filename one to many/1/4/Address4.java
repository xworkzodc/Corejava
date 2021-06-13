class Address4{
	String street4;
	int doorNo4;
	Country4 country4;
	
	Address4(String street4, int doorNo4)
	{
		this.street4=street4;
		this.doorNo4=doorNo4;
	}
	
	void initCountry4(Country4 country4)
	{
		this.country4=country4;
	}
	
	void addressProperties4()
	{
		System.out.println("Address street "+this.street4);
		System.out.println("Address doorNo "+this.doorNo4);
		if(this.country4!=null)
		{
		this.country4.countryProperties4();
		}
	}
}

		