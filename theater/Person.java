class Person{
	String name;
	String email;
	int age;
	double phoneNo;
	
	Person()
	{}
	
	Person(String name,String email,int age,double phoneNo)
	{
		this.name=name;
		this.email=email;
		this.age=age;
		this.phoneNo=phoneNo;
	}
	
	void displayPerson()
	{
		System.out.println("Person name "+this.name);
		System.out.println("Person email "+this.email);
		System.out.println("Person age "+this.age);
		System.out.println("Person phoneNo "+this.phoneNo);
	}
}