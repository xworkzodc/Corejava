class Facebook{
float version;
String leadDeveloper;
int releaseDate;

Facebook(float newVersion)
{
System.out.println("invoked version constructor");	
version=newVersion;
}
 
Facebook(String newDeveloper){
System.out.println("invoked leadDeveloper constructor");	
leadDeveloper=newDeveloper;
}

Facebook(int releasedDate){
System.out.println("invoked releasedate constructor");	
releaseDate=releasedDate;
}

Facebook(float newVersion ,String newDeveloper){
System.out.println("invoked version leaddeveloper constructor");	
version=newVersion;
leadDeveloper=newDeveloper;
}

Facebook(float newVersion ,String newDeveloper, int releasedDate){
System.out.println("invoked version leadDeveloper releaseDate constructor");	
version=newVersion;
leadDeveloper=newDeveloper;
releaseDate=releasedDate;
}

Facebook(float newVersion ,int releasedDate ){
System.out.println("invoked version releaseDate constructor");	
version=newVersion;
releaseDate=releasedDate;
}

Facebook(String Developer, int releasedDate){
System.out.println("invoked leadDeveloper releaseDate constructor");	
leadDeveloper=Developer;
releaseDate=releasedDate;
}
}
	
	
	
	
	