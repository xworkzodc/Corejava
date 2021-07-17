class WashingMachine{
	String brand;
	String model;
	
	@Override
	public int hashCode()
	{
		System.out.println("invoked hashcode from WashingMachine");
		int valueFromParentCode=super.hashCode();
		return valueFromParentCode;
		// return 6789;
	}
	
	@Override
	public String toString()
	{
	return this.brand.hashCode()+","+this.model.hashCode();	
	}
	
	void setValue(String brand, String model)
	{
		this.brand=brand;
		this.model=model;
	}
		
	//@Override
	public void open()
	{
		System.out.println("washing Machine is open ");
	}
}