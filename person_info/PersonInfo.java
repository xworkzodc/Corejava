class PersonInfo{
static String name;
static long contactNo;
static Gender gender= Gender.NA;
static PersonStatus status;

static void setInfo( String newName, long newContactNo, Gender newGender, PersonStatus newStatus)
{
System.out.println("invoke setInfo");
System.out.println(newName);
System.out.println(newContactNo);
System.out.println(newGender);
System.out.println(newStatus);
name=newName;
contactNo=newContactNo;
gender=newGender;
status=newStatus;
return;
}

static void displayAll()
{
System.out.println("invoke displayAll");
System.out.println(name);
System.out.println(contactNo);
System.out.println(gender);
System.out.println(status);
}
}