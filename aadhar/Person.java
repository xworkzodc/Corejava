class Person {
	String name;
	Gender gender;
	BloodGroup bg;
	Aadhar aadhar =new Aadhar();
	
	enum Gender{
		M,F,T
	}
	enum BloodGroup{
		A,B,O,AB,AB_NEGATIVE,O_NEGATIVE
	}
	
	Person(String name,Gender gender, BloodGroup bloodGroup)
	{
		this.name=name;
		this.gender=gender;
		bg=bloodGroup;
	}
	void aadharCard(String dob,boolean phoneLinked)
	{
		this.aadhar.dob=dob;
		this.aadhar.phoneLinked=phoneLinked;
		aadhar.number++;
	}
		

	void displayProperties()
	{
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.bg);
		System.out.println(this.aadhar.number);
		System.out.println(this.aadhar.dob);
		System.out.println(this.aadhar.phoneLinked);
	}
}