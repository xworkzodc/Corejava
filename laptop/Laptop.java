class Laptop{
static String brand;
static int memory;


public static void display()
{
System.out.println("Laptop brand is "+ brand);
System.out.println("laptop memory is "+memory);

}

public static void changeMemory()
{
memory=8;
System.out.println("changed memory is  "+memory);
}

public static void changeBrand()
{
brand="dell";
System.out.println("changed brand is "+brand);
}

}