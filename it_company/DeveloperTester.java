class DeveloperTester{
	
	public static void main(String[] args)
	{
		Developer developer=new Developer("Sachin",Developer.Designation.FULL_STACK);
		developer.updateSalaryAndTotalExp(450000,0.1);
		
		String[] skills=new String[3];
		skills[0]="java";
		skills[1]="web";
		skills[2]="abap";
		
		developer.initTechnologies(skills);
		
		developer.displayProperties();		
	}
	
}
