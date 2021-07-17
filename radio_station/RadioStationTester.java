class RadioStationTester{
	public static void main(String[] args){
		RadioStation ref=new RadioStation("FMRadio",108);
		ref.setnoOfAudience(10);
 
 RadioStation ref1=new RadioStation("FMRadio",108);
 ref.setnoOfAudience(20);
 
 boolean equals = ref1.equals(ref);
 System.out.println("ref and ref1 is equals: "+equals);
	}

	
}