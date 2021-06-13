class Developer5{
	String name5;
	String email5;
	Address5[] addresses5;
	
	Developer5(String name5, String email5)
	{
		this.name5=name5;
		this.email5=email5;
	}
	
	void initAddress5(Address5[] addresses5)
	{
		if(addresses5!=null)
		{
			this.addresses5=addresses5;
		}
	}
	
	void developerProperties5()
	{
		System.out.println("Developer name5 "+this.name5);
		System.out.println("Developer email5 "+this.email5);
		if(this.addresses5!=null)
		{
			for (int index=0; index<this.addresses5.length; index++)
			{
				this.addresses5[index].addressProperties5();
			}
		}
	}
}
