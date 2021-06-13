class Developer1{
	String name1;
	String email1;
	Address1[] addresses1;
	
	Developer1(String name1, String email1)
	{
		this.name1=name1;
		this.email1=email1;
	}
	
	void initAddress1(Address1[] addresses1)
	{
		if(addresses1!=null)
		{
			this.addresses1=addresses1;
		}
	}
	
	void developerProperties1()
	{
		System.out.println("Developer name1 "+this.name1);
		System.out.println("Developer email1 "+this.email1);
		if(this.addresses1!=null)
		{
			for (int index=0; index<this.addresses1.length; index++)
			{
				this.addresses1[index].addressProperties1();
			}
		}
	}
}
