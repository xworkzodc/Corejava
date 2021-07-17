class EarPhone{
static String color;
static boolean connected;
static int price;

public static void sound()
{
System.out.println("Earphone price is "+price);
System.out.println("Earphone color is "+color);

if (connected)
{
System.out.println(price);
System.out.println(color);
}
else
{
System.out.println(" not connected");
}

}
}
