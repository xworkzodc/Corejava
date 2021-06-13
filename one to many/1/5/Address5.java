class Address5{
	String street5;
	int doorNo5;
	Country5 country5;
	
	Address5(String street5, int doorNo5)
	{
		this.street5=street5;
		this.doorNo5=doorNo5;
	}
	
	void initCountry5(Country5 country5)
	{
		this.country5=country5;
	}
	
	void addressProperties5()
	{
		System.out.println("Address street "+this.street5);
		System.out.println("Address doorNo "+this.doorNo5);
		if(this.country5!=null)
		{
		this.country5.countryProperties5();
		}
	}
}

		