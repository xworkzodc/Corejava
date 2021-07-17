class Aadhar{
	static long number;
	String dob;
	boolean phoneLinked;
	
	
	Aadhar ()
	{
		System.out.println("default constructor");
	}
	
	Aadhar(String dob,boolean phoneLinked)
	{
		this.dob=dob;
		this.phoneLinked=phoneLinked;
		number++;
		System.out.println("dob "+this.dob);
		System.out.println("phoneLinked "+this.phoneLinked);
		System.out.println("number "+this.number);
	}
	
	
}
