class Country1{
	String name1;
	int code1;
	State1[] state1;
	
	Country1 (String name1, int code1)
	{
		this.name1=name1;
		this.code1=code1;
	}
	void initState1(State1[] state1)
	{
		if(state1!=null)
		{	
			this.state1= state1;
		}
	}
	
	void countryProperties1()
	{
		System.out.println("Country name "+this.name1);
		System.out.println("Country code "+this.code1);
		if(state1!=null)
		{
			for (int index=0; index<this.state1.length; index++)
			{
				this.state1[index].stateProperties1();
			}
		}
	}
}