class Refrigerator{
static int capacity;
static boolean opened;


public static void open()
{
opened=true;
System.out.println("door is open" );

}

public static void close()
{
opened=false;
System.out.println("door closed");

}


public static void displayOpened()
{
System.out.println(opened);

}

}