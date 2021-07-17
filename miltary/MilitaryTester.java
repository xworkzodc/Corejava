class MilitaryTester{
	public static void main(String[] args){
		
		Military mil1 = new Military("India",40L,MilitaryType.AIRFORCE,"1A688");
		
		
		Military mil2 = new Military("France",60L,MilitaryType.NATIONALGUARD,"U768");
		
		System.out.println(mil1==mil2);
		
		boolean value = mil1.equals(mil2);
		System.out.println("mil1 and mil2 are equal: " + value);
		
		
		System.out.println(mil1);		
	}
}