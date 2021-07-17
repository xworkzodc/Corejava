class ActorArrayTester{

public static void main(String[] args)
{
String[] actor={"Dhanush","Vijay Sethupathi","Dhananjay","Vishnuvardhan","Pooja Hegde", "Kajal Aggarwal","Sai Pallavi","Randeep Hooda","Juhi Chawla","Sunny Leone"};

System.out.println("Length of Actor "+ actor.length);
for (int indexOfActor=0; indexOfActor < actor.length; indexOfActor++)
{
String tempActor=actor[indexOfActor];
System.out.println("Index " + indexOfActor);
System.out.println(tempActor);
if(tempActor.equals("Sunny Leone"))
{
System.out.println("My Favourite Actor");
}
}
}
}