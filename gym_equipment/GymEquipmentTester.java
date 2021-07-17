class GymEquipmentTester{
	public static void main(String[] args){
 GymEquipment temp=new GymEquipment("Bench",500,EquipmentType.DUMBBELL);
 temp.setCompany("BrunswickCorp");
 
 GymEquipment temp1=new GymEquipment("Treadmill",500,EquipmentType.KETTLEBELL);
 temp.setCompany("LifeFitness");
 
 boolean equals=temp1.equals(temp);
 System.out.println("temp and temp1 is equals: "+equals);
	}
}