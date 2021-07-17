class MallTester{
	public static void main(String[] args){
		
		Mall mall1 = new Mall("orion","Rajajinagar");
		mall1.setAmbience(true);
		mall1.setNoOfFloors(5);
		
		Mall mall2 = new Mall("orion","Rajajinagar");
		mall2.setAmbience(true);
		mall2.setNoOfFloors(4);
		
		System.out.println(mall1==mall2);
		
		boolean value = mall2.equals(mall1);
		System.out.println("mall1 and mall2 are equal: " + value);
			
		
		
		
	}
}