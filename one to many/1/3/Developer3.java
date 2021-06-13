class Developer3{
	String name3;
	String email3;
	Address3[] addresses3;
	
	Developer3(String name3, String email3)
	{
		this.name3=name3;
		this.email3=email3;
	}
	
	void initAddress3(Address3[] addresses3)
	{
		if(addresses3!=null)
		{
			this.addresses3=addresses3;
		}
	}
	
	void developerProperties3()
	{
		System.out.println("Developer name "+this.name3);
		System.out.println("Developer email "+this.email3);
		if(this.addresses3!=null)
		{
			for (int index=0; index<this.addresses3.length; index++)
			{
				this.addresses3[index].addressProperties3();
			}
		}
	}
}
