class Developer{
	Designation desgn;
	double salary;
	String name;
	double totalExp;
	String[] technologies;
	
	enum Designation{
		JAVA,FULL_STACK,NET,SQL,UI;
	}
	
	Developer(String name,Designation desgn)
	{
		this.name=name;
		this.desgn=desgn;
	}
	
	void updateSalaryAndTotalExp(double salary,double totalExp)
	{
		this.salary=salary;
		this.totalExp=totalExp;
	}
	
	void initTechnologies(String[] technologies)
	{
		this.technologies=technologies;
	}
	
	void displayProperties()
	{
		System.out.println(this.name);
		System.out.println(this.desgn);
		System.out.println(this.totalExp);
		System.out.println(this.salary);
		System.out.println(this.technologies.length);
		for (int i=0;i<this.technologies.length;i++)
		{
			System.out.println(this.technologies[i]);
		}
	}
}