class Airhostess{
	String name;
	int id;
	Enum dressCode;;
	boolean goodLooking;
	
	enum Enum{
		BLUE_UNIFORM,RED_UNIFORM,BLACK_UNIFORM,YELLOW_UNIFORM;
	}
	
	
	Airhostess(String name, int id, Enum dressCode, boolean goodLooking)
	{
		this.name=name;
		this.id=id;
		this.dressCode=dressCode;
		this.goodLooking=goodLooking;
	}
	
	void displayProperties()
	{
		
		System.out.println("Airhostess Name "+this.name);
		System.out.println("Airhostess id "+this.id);
		System.out.println("Airhostess dressCode "+this.dressCode);
		System.out.println("Airhostess goodLooking "+this.goodLooking);
	}
	
}
	