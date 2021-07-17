class Country{
	String name;
	int code;
	State[] state;
	
	Country (String name, int code)
	{
		this.name=name;
		this.code=code;
	}
	void initState(State[] state)
	{
		if(state!=null)
		{	
			this.state= state;
		}
	}
	
	void countryProperties()
	{
		System.out.println("Country name "+this.name);
		System.out.println("Country code "+this.code);
		if(state!=null)
		{
			for (int index=0; index<this.state.length; index++)
			{
				this.state[index].stateProperties();
			}
		}
	}
}