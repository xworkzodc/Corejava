class AmusementParkTester{
	public static void main(String[] args){
		
 AmusementPark park=new AmusementPark("Wondela","bidadi",1400,70,true);
 park.setLicenseNo("WONDERLA2345");
 
 AmusementPark park1=new AmusementPark("GRS","Mysore",1400,70,true);
 park1.setLicenseNo("GRS34352");
 
 boolean equals=park.equals(park1);
 System.out.println("park and park1 is equals: "+equals);
	}
}