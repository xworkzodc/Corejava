class ComputerMouse{
static boolean wireLess;
static String chargeable;
static int range;

static void changeWireLess(boolean newWireLess)
{
System.out.println(newWireLess);
System.out.println("wireless before change "+wireLess);
wireLess=newWireLess;
System.out.println("wireless after change " +wireLess);
}

static void  changeChargeable(String newChargeable)
{
System.out.println(newChargeable);
System.out.println("chargeable before change "+chargeable);
chargeable=newChargeable;
System.out.println("chargeable after change " +chargeable);
}

static void  changeRange(int newRange) {
System.out.println(newRange);
System.out.println("range before change "+range);
range=newRange;
System.out.println("range after change " +range);
}


static void  displayAll()
{
System.out.println(wireLess);
System.out.println(chargeable);
System.out.println(range);
}


}





