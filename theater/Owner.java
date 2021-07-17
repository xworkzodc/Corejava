class Owner extends Person{
	Theater[] theater;
	
	void setOwnerTheater()
	{
		this.theater=theater;
	}
	
	void displayOwner()
	{
		System.out.println("owner theater "+this.theater);
		super.displayPerson();
	}
	void displayTheaterDetails()
	{
		for (int index=0; index<this.theater.length; index++)
		{
		this.theater[index].displayTheater();
		}
	}
	void displayTheaterManagerName()
	{
		for(int index=0; index<this.theater.5length; index++)
			{
			
			}
}