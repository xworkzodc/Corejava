class TravelAgency
{
static String[] agencies=new String[5];
static int index=0;

static void addAgency(String agencyName)
{
System.out.println("agencyName "+agencyName);
if(index >4)
{
System.out.println("index is full, cannot add more elements");
return;
}
agencies[index]=agencyName;
index++;
}
static void displayAgencies()
{
for(int tempIndex=0; tempIndex< agencies.length; tempIndex++)
{
System.out.println(agencies[tempIndex]);
}
}
static void displayAgencyAtIndex(int newIndex)
{
if(newIndex<5)
{
System.out.println("index is available");
System.out.println(agencies[newIndex]);
}
else
{
System.out.println("index not available");
}
}
static void printFoundIfAgency(String agencyName)
{
for(int tempIndex=0; tempIndex< agencies.length; tempIndex++)
{
String agency=agencies[tempIndex];
System.out.println(agency);
if(agency.equals(agencyName))
{
System.out.println("Found");
break;
}
}
}
}