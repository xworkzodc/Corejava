class WashingMachineTester{
	public static void main(String[] args){
	
	WashingMachine machine=new WashingMachine();
		
	 machine.setValue("Samsung","S234");
	
	System.out.println(machine.hashCode());

	System.out.println("toStringimplicit:"+machine);
	System.out.println("toString explicit:"+machine.toString());

	}
}