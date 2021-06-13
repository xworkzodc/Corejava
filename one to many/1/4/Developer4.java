class Developer4{
	String name4;
	String email4;
	Address4[] addresses4;
	
	Developer4(String name4, String email4)
	{
		this.name4=name4;
		this.email4=email4;
	}
	
	void initAddress4(Address4[] addresses4)
	{
		if(addresses4!=null)
		{
			this.addresses4=addresses4;
		}
	}
	
	void developerProperties4()
	{
		System.out.println("Developer name4 "+this.name4);
		System.out.println("Developer email4 "+this.email4);
		if(this.addresses4!=null)
		{
			for (int index=0; index<this.addresses4.length; index++)
			{
				this.addresses4[index].addressProperties4();
			}
		}
	}
}
