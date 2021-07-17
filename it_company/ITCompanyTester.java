class ITCompanyTester{
	
	public static void main(String[] args)
	{
		ITCompany company=new ITCompany("sigma Tech park",true,"Whitefield",80000000);
		
		Developer dev1=new Developer("Sachin",Developer.Designation.JAVA);
		dev1.updateSalaryAndTotalExp(35000,0.1);
		String[] skills=new String[3];
		skills[0]="java";
		skills[1]="web";
		skills[2]="abap";
		dev1.initTechnologies(skills);
		Developer[] developer=new Developer[1];
		developer[0]=dev1;
		company.initDeveloper(developer);
		company.displayProperties();		
	}
	
}