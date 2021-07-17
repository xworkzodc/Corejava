class RadioStation{
	String name;
	double frequency;
	int noOfAudience;
	 RadioStation(String name,double frequency)
	 {
		 this.name=name;
		 this.frequency=frequency;
	 }
	 void setnoOfAudience(int noOfAudience)
	 {
		 this.noOfAudience=noOfAudience;
	 }
	@Override
	 public String toString()
	 {
		 return"RadioStation";
	 }
	 @Override
	 public int hashCode()
	 {
		 return 60;
	 }
	 
	 @Override
	 public boolean equals(Object ref)
	 {
		 System.out.println("invoke equals in RadioStation ");
		 if(ref==null)return false;
		 if(ref instanceof RadioStation)
		 {
			 System.out.println("temp is a GymEquipment");
			RadioStation refInstance=(RadioStation)ref;
			 String name=refInstance.name;
			 if(this.name.equals(name)&& this.frequency==refInstance.frequency)
			 {
				 System.out.println("RadioStation is equal"); 
				 return true;
			 }
		 }
		 else{
			 System.out.println(" RadioStation is not equal"); 
		 }
		 return true;
	 

	 }
}