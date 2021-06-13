class Country4{
	String name4;
	int code4;
	State4[] state4;
	
	Country4 (String name4, int code4)
	{
		this.name4=name4;
		this.code4=code4;
	}
	void initState4(State4[] state4)
	{
		if(state4!=null)
		{	
			this.state4= state4;
		}
	}
	
	void countryProperties4()
	{
		System.out.println("Country name "+this.name4);
		System.out.println("Country code "+this.code4);
		if(state4!=null)
		{
			for (int index=0; index<this.state4.length; index++)
			{
				this.state4[index].stateProperties4();
			}
		}
	}
}