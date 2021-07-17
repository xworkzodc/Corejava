class Theater{
	Person owner;
	Person[] customers;
	Hall[] halls;
	Person manager;
	
	void setTheaterOwner(Person owner)
	{
		this.owner=owner;
	}
	
	void setTheaterCustomers(Person[] customers)
	{
		this.customers=customers;
		
	}
	
	void setTheaterHall(Hall[] halls)
	{
		this.halls=halls;
	}
	
	void setTheaterManager(Person manager)
	{
		
		this.manager=manager;
	}
	
	void displayTheater()
	{
		System.out.println("Theater owner "+this.owner);
		System.out.println("Theater manager "+this.manager);
		
		Person person=new Customer();
		Customer cast=(Customer)person;
		for (int index=0; index<this.customers.length; index++)
		{
		this.customers[index].displayPerson();
		}
		for (int i=0; i<this.halls.length; i++)
		{
		this.halls[i].displayHall();
		}
	}
	
	/*void displayManagerPreviousCompany()
	{
		for (int i=0; i<this.manager.length; i++)
		{
		this.manager[i].displayPerson();
		}
		System.out.println("ManagerPreviousCompany "+this.manager.previousCompany);
	}*/
	
	void displayHallDetails()
	{
		for (int i=0; i<this.halls.length; i++)
		{
		this.halls[i].displayHall();
		}
	}
	
	void displayOwnerName()
	{
		System.out.println("Theater owner "+this.owner);
	}
	
}