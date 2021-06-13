class Country5{
	String name5;
	int code5;
	State5[] state5;
	
	Country5 (String name5, int code5)
	{
		this.name5=name5;
		this.code5=code5;
	}
	void initState5(State5[] state5)
	{
		if(state5!=null)
		{	
			this.state5= state5;
		}
	}
	
	void countryProperties5()
	{
		System.out.println("Country name "+this.name5);
		System.out.println("Country code "+this.code5);
		if(state5!=null)
		{
			for (int index=0; index<this.state5.length; index++)
			{
				this.state5[index].stateProperties5();
			}
		}
	}
}