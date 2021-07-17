class ComputerTester
{
public static void main(String[] args)
{
	Computer comp=new Computer();
	System.out.println(comp.brand);
	System.out.println(comp.price);
	comp.brand="Dell";
	System.out.println("Brand: "+ comp.brand);
	comp.price=30000;
	System.out.println("Price: "+ comp.price);
	
	Computer comp2=new Computer();
	comp2.brand="HP";
	System.out.println("Brand: "+ comp2.brand);
	comp2.price=40000;
	System.out.println("Price: "+ comp2.price);
	
	Computer comp3=new Computer();
	comp3.brand="LENOVO";
	System.out.println("Brand: "+ comp3.brand);
	comp3.price=35000;
	System.out.println("Price: "+ comp3.price);
	
	Computer comp4=new Computer();
	comp4.brand="ASUS";
	System.out.println("Brand: "+ comp4.brand);
	comp4.price=60000;
	System.out.println("Price: "+ comp4.price);

	Computer comp5=new Computer();
	comp5.brand="APPLE";
	System.out.println("Brand: "+ comp5.brand);
	comp5.price=80000;
	System.out.println("Price: "+ comp5.price);
	
	Computer comp6=new Computer();
	comp6.brand="ACER";
	System.out.println("Brand: "+ comp6.brand);
	comp6.price=70000;
	System.out.println("Price: "+ comp6.price);
	
	Computer comp7=new Computer();
	comp7.brand="SAMSUNG";
	System.out.println("Brand: "+ comp7.brand);
	comp7.price=20000;
	System.out.println("Price: "+ comp7.price);
	
	Computer comp8=new Computer();
	comp8.brand="TOSHIBA";
	System.out.println("Brand: "+ comp8.brand);
	comp8.price=42000;
	System.out.println("Price: "+ comp8.price);
	
	Computer comp9=new Computer();
	comp9.brand="HP";
	System.out.println("Brand: "+ comp9.brand);
	comp9.price=44000;
	System.out.println("Price: "+ comp9.price);
	
	Computer comp10=new Computer();
	comp10.brand="DELL";
	System.out.println("Brand: "+ comp10.brand);
	comp10.price=45000;
	System.out.println("Price: "+ comp10.price);
}
}