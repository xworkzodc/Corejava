class NameMatcher {
static String getFullName(String firstName)
{
String fullName="NA";
if(firstName.equals("Sachin"))
{
String sachinFullName="Sachin G M";
fullName= sachinFullName;
System.out.println("fullName:- "+ fullName);
return fullName;
}
if(firstName.equals("Akshay"))
{
String akshayFullName="Akshay S Pawar";
fullName= akshayFullName;
System.out.println("fullName:- "+ fullName);
return fullName;
}
if(firstName.equals("Manmohan"))
{
String manmohanFullName="Manmohan C";
fullName= manmohanFullName;
System.out.println("fullName:- "+ fullName);
return fullName;
}
if(firstName.equals("Darshan"))
{
String darshanFullName="Darshan K M";
fullName= darshanFullName;
System.out.println("fullName:- "+ fullName);
return fullName;
}
if(firstName.equals("Sharath"))
{
String sharathFullName="Sharath Parkal";
fullName= sharathFullName;
System.out.println("fullName:- "+ fullName);
return fullName;
}
if(firstName.equals("Saanvi"))
{
String saanviFullName="Saanvi joseph";
fullName= saanviFullName;
System.out.println("fullName:- "+ fullName);
return fullName;
}
if(firstName.equals("Rakshit"))
{
String rakshitFullName="Rakshit Shetty";
fullName= rakshitFullName;
System.out.println("fullName:- "+ fullName);
return fullName;
}
if(firstName.equals("Chandan"))
{
String chandanFullName="Chandan Achar";
fullName= chandanFullName;
System.out.println("fullName:- "+ fullName);
return fullName;
}if(firstName.equals("Shanvi"))
{
String shanviFullName="Shanvi Srivastava";
fullName= shanviFullName;
System.out.println("fullName:- "+ fullName);
return fullName;
}
if(firstName.equals("Bro"))
{
String broFullName="Bro Gowda";
fullName= broFullName;
System.out.println("fullName:- "+ fullName);
return fullName;
}
if(fullName=="NA")
{
System.out.println("give name is not found");
}
return fullName;
}
}