class FacebookTester{
public static void main(String[]args){

Facebook version1=new Facebook(4.1f);
System.out.println("version : " + version1.version);

Facebook developed=new Facebook("Mark Zuckerberg");
System.out.println("Developer : " +  developed.leadDeveloper);

Facebook launched=new Facebook(2004);
System.out.println("ReleaseDate : " + launched.releaseDate);

Facebook developed1=new Facebook(5.2f,"Mark Zuckerberg");
System.out.println("version : " + developed1.version);
System.out.println("Developer : " + developed1.leadDeveloper);

Facebook developed2=new Facebook(5.4f,"Mark Zuckerberg",2008);
System.out.println("version : " + developed2.version);
System.out.println("Developer : " + developed2.leadDeveloper);
System.out.println("ReleaseDate : " + developed2.releaseDate);

Facebook developed3=new Facebook(5.6f,2012);
System.out.println("version  :" + developed3.version);
System.out.println("ReleaseDate : " + developed3.releaseDate);

Facebook developed4=new Facebook("Mark Zuckerberg",2016);
System.out.println("Developer : " + developed4.leadDeveloper);
System.out.println("ReleaseDate : " + developed4.releaseDate);


}

}