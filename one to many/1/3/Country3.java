class Country3{
	String name3;
	int code3;
	State3[] state3;
	
	Country3 (String name3, int code3)
	{
		this.name3=name3;
		this.code3=code3;
	}
	void initState3(State3[] state3)
	{
		if(state3!=null)
		{	
			this.state3= state3;
		}
	}
	
	void countryProperties3()
	{
		System.out.println("Country name "+this.name3);
		System.out.println("Country code "+this.code3);
		if(state3!=null)
		{
			for (int index=0; index<this.state3.length; index++)
			{
				this.state3[index].stateProperties3();
			}
		}
	}
}