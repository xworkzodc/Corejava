class ComputerMouse{
String brand;
int range;

ComputerMouse()
{
	this("dell",20);
	System.out.println(" Default constructor");
}

ComputerMouse(String brand, int range)
{
	System.out.println("invoked brand and range");
	this.brand=brand;
	this.range=range;
	System.out.println("brand "+this.brand);
	System.out.println("range "+this.range);
}

void changeRange(int range)
{
	System.out.println("invoking range method ");
	this.range=range;
	System.out.println("changeRange " +this.range);
	this.changeBrand("HP");
}

void changeBrand(String brand)
{
	System.out.println("invoking change brand method ");
	this.brand=brand;
	System.out.println("brand method " +this.brand);
}

}





