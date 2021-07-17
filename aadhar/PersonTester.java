class PersonTester{
	public static void main(String[] args)
	{
		Person person1= new Person("Sachin", Person.Gender.M,Person.BloodGroup.B);
		person1.displayProperties();
		Aadhar aadhar1=new Aadhar("06/05/1997",false);
		
		
		Person person2= new Person("Sanjay", Person.Gender.F,Person.BloodGroup.A);
		person2.aadharCard("13/03/1999",true);		
		person2.displayProperties();
	}
}
