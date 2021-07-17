class Manager extends Person{
	int totalExp;
	String previousCompany;
	
	Manager(){}
	
	Manager(int totalExp, String previousCompany)
	{
		this.totalExp=totalExp;
		this.previousCompany=previousCompany;
	}
	
	void displayManager()
	{
		System.out.println("Manager totalExp "+this.totalExp);
		System.out.println("Manager previousCompany "+this.previousCompany);
		super.displayPerson();
	}
}