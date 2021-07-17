class AmusementPark{
	String name;
	String location;
	double ticketPrice;
	int noofgames;
	boolean waterGame;
	String licenseNo;
	
	AmusementPark(String name,String location,double ticketPrice,int noofgames,boolean waterGame){
		System.out.println("invokeing constr");
		this.name=name;
		this.location=location;
		this.ticketPrice=ticketPrice;
		this.noofgames=noofgames;
		this.waterGame=waterGame;
		
	}
	void setLicenseNo(String licenseNo){
		System.out.println("invokeing method");
		this.licenseNo=licenseNo;
		
	}
	
	@Override
	public String toString(){
		System.out.println("invokeing toString method");
		return "AmusementPark";
	}
	@Override
	public int hashCode(){
		System.out.println("invokeing hashCode method");
		return 745673;
	}
	public boolean equals(Object obj)
	 {
		 System.out.println("invoke equals in AmusementPark ");
		 if(obj==null)return false;
		 if(obj instanceof AmusementPark)
		 {
			 System.out.println("obj is a AmusementPark ");
			AmusementPark  otherInstance=(AmusementPark)obj;
			 String name=otherInstance.name;
						
	   	 
		if(this.ticketPrice==otherInstance.ticketPrice && this.noofgames==otherInstance.noofgames){
				 System.out.println("AmusementPark is equal"); 
				 return true;
			 }
		 }
		 else{
			 System.out.println(" AmusementPark is not equal"); 
		 }
		 return false;
	 }
}