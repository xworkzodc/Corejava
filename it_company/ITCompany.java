class ITCompany{
	String nameOfTechPark;
	boolean goodAmbience;
	String location;
	double investment;
	Developer[] developer;
	
	ITCompany(String parkName, boolean goodAmbience, String location,double investment)
	{
		this.nameOfTechPark=parkName;
		this.goodAmbience=goodAmbience;
		this.location=location;
		this.investment=investment;
	}
	void initDeveloper(Developer[] devp)
	{
		this.developer=devp;
	}
	void displayProperties()
	{
		System.out.println(this.nameOfTechPark);
		System.out.println(this.goodAmbience);
		System.out.println(this.location);
		System.out.println(this.investment);
		System.out.println(this.developer.length);
				for (int i=0;i<this.developer.length;i++)
		{
			System.out.println(this.developer[i]);
		}
	}
}