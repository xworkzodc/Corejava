class Hotel{

static String starterName;
static int foodId;

static int orderFood(String newStarterName)
{
System.out.println("newStarterName " +newStarterName);
starterName=newStarterName;
}

static void orderFood(String newStarterName)
{
System.out.println("mainFoodId " +mainFoodId);
foodId=mainFoodId;
}

static void orderFood(String starter, int newFoodId)
{
System.out.println("starter " +starter);
System.out.println("newFoodId " +newFoodId);
starterName=starter;
foodId=newFoodId;
}

}



