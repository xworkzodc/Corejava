class ComputerLaptopTester{
	
	public static void main(String[] args)
	{	
		Computer comp = new Laptop(1.6,true);
		
		comp.init("DELL235",40000);
		
		Laptop cast= (Laptop)comp;
		
		boolean castedvalue = cast.camera;
		System.out.println(castedvalue);
		System.out.println("___________________");
		cast.displayProperties();	
	}
}