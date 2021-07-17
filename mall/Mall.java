class Mall{
	String name;
	String location;
	Boolean ambience;
	int noOfFloors;
	
	
	Mall(String name,String location){
		System.out.println("invoked Mall constructor()");
		this.name=name;
		this.location=location;
	}
	
	void setAmbience(boolean ambience){
		System.out.println("invokewd setAmbience method()");
		this.ambience = ambience;
	}
	
	void setNoOfFloors(int noOfFloors){
		System.out.println("invoked setnooffloors method()");
	}
	
	@Override
	public String toString(){
		return "orion";
	}
	
	@Override
    public int hashCode(){
		return 12;
	}	
	
	
	@Override
	public boolean equals(Object ref){
		System.out.println("equals method()");
		if(ref==null)return false;
		if(ref instanceof Mall){
			System.out.println("check properties");
			Mall instance = (Mall)ref;
			String name = instance.name;
			String location = instance.location;
			
			if(this.name.equals(name)){
				System.out.println("equal");
				return true;
			}
		}
		
		else{
			System.out.println("not found");
		}
	           return false;	
	}
	
	
}