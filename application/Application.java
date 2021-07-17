class Application
{
static String[] application=new String[10];
static int index=0;

static void addApplication(String applicationName)
{
System.out.println("applicationName "+applicationName);
if(index >=10)
{
System.out.println("index is full, cannot add more elements");
return;
}
application[index]=applicationName;
index++;
}
static void displayApplication()
{
for(int tempIndex=0; tempIndex< application.length; tempIndex++)
{
System.out.println(application[tempIndex]);
}
}
static void displayApplicationAtIndex(int newIndex)
{
if(newIndex<10)
{
System.out.println("index is available");
System.out.println(application[newIndex]);
}
else
{
System.out.println("index not available");
}
}
static void printFoundIfApplication(String applicationName)
{
for(int tempIndex=0; tempIndex< application.length; tempIndex++)
{
String applications=application[tempIndex];
System.out.println(applications);
if(applications.equals(applicationName))
{
System.out.println("Found");
break;
}
}
}
}