class CricketerArrayTester{

public static void main(String[] args)
{
String[] cricketer={"Virat Kohli","M S Dhoni","Yuvraj Singh","Ravindra Jadeja","K L Rahul", "Rohit Sharma","Yuzvendra Chahal","Hardik Pandya","Mohammed Siraj","Jasprit Bumrah"};

System.out.println("Length of Cricketer "+cricketer.length);
for (int indexOfCricketer=0; indexOfCricketer < cricketer.length; indexOfCricketer++)
{
String tempCricketer=cricketer[indexOfCricketer];
System.out.println("Index " + indexOfCricketer);
System.out.println(tempCricketer);
if(tempCricketer.equals("Rohit Sharma"))
{
System.out.println("My Favourite player");
}
if(tempCricketer.equals("Virat Kohli"))
{
System.out.println("Indian Captain");
}
}
}
}