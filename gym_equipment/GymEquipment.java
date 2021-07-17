class GymEquipment{
	String name;
	EquipmentType type;
	double weight;
	String company;
	
	 GymEquipment(String name,double weight,EquipmentType type){
		 this.name=name;
		 this.weight=weight;
		 this.type=type;
		 
	 }
	 void setCompany(String company){
		 this.company=company;
	 }
	 @Override
	 public String toString()
	 {
		 return"GymEquipment";
	 }
	 @Override
	 public int hashCode()
	 {
		 System.out.println("invoke hashCode in GymEquipment ");
		 return 5;
	 }
	 
	 @Override
	 public boolean equals(Object temp)
	 {
		 System.out.println("invoke equals in GymEquipment ");
		 if(temp==null)return false;
		 if(temp instanceof GymEquipment)
		 {
			 System.out.println("temp is a GymEquipment ");
			GymEquipment  tempInstance=(GymEquipment)temp;
			 String name=tempInstance.name;
			 if(this.name.equals(name)&& this.weight==tempInstance.weight && this.type.equals(type))
			 {
				 System.out.println("GymEquipment is equal"); 
				 return true;
			 }
		 }
		 else{
			 System.out.println(" GymEquipment is not equal"); 
		 }
		 return false;
	 }
}