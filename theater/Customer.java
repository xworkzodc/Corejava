class Customer extends Person{
	boolean platinum;
	
	Customer()
	{}
	
	Customer(boolean platinum)
	{
		this.platinum=platinum;
	}
	
	void displayCustomer()
	{
		System.out.println("Customer platinum "+this.platinum);
		super.displayPerson();
	}
}