class Computer{
	String brand;
	String modelNo;
	double price;
	
	Computer(String brand)
	{
		System.out.println("computer brand Constructor");
		this.brand=brand;
	}
	
	void init(String modelNo, double price)
	{
		System.out.println("computer model no and price method");
		this.price=price;
	}
}
