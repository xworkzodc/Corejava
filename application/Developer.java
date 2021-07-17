class Developer{
	String name;
	String email;
	Address[] addresses;
	
	Developer(String name, String email)
	{
		this.name=name;
		this.email=email;
	}
	
	void initAddress(Address[] addresses)
	{
		if(addresses!=null)
		{
			this.addresses=addresses;
		}
	}
	
	void developerProperties()
	{
		System.out.println("Developer name "+this.name);
		System.out.println("Developer email "+this.email);
		if(this.addresses!=null)
		{
			for (int index=0; index<this.addresses.length; index++)
			{
				this.addresses[index].addressProperties();
			}
		}
	}
}
