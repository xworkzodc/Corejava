class IceCreamArrayTester{

public static void main(String[] args)
{
String[] iceCream={"ButterScotch","Vanilla","Chocolate","Kulfi","Falooda", "Rolled IceCream","Cookies and Cream","Blue Moon","Banana Split","Mango"};

System.out.println("Length of IceCream "+ iceCream.length);
for (int indexOfIceCream=0; indexOfIceCream< iceCream.length; indexOfIceCream++)
{
String tempIceCream=iceCream[indexOfIceCream];
System.out.println("Index " + indexOfIceCream);
System.out.println(tempIceCream);
if(tempIceCream.equals("Kulfi"))
{
System.out.println("My Favourite IceCream");
}
if(tempIceCream.equals("Vanilla"))
{
System.out.println("I dont like this IceCream");
}
}
}
}