class OvenTester
{
	public static void main(String[] args)
	{
	Oven oven1= new Oven("Samsung","Convection and grill",8980);
	System.out.println(oven1.brand);
	System.out.println(oven1.type);
	System.out.println(oven1.modelNo);
	
	Oven oven2= new Oven("LG", "Convection", 7878);
	oven2=oven1;
	System.out.println(oven2.brand);
	System.out.println(oven2.type);
	System.out.println(oven2.modelNo);
	}
}