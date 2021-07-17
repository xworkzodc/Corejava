class MobileArrayTester{

public static void main(String[] args)
{
String[] mobile={"Redmi note 5 pro","Oppo A12","Nokia N95","Realme 8 Pro","Poco X3", "Samsung Galaxy M31s","Moto one Fusion Plus","Vivo S1 Pro","Infinix 10 play","Honor 7S"};

System.out.println("Length of Mobile "+ mobile.length);
for (int indexOfMobile=0; indexOfMobile< mobile.length; indexOfMobile++)
{
String tempMobile=mobile[indexOfMobile];
System.out.println("Index " + indexOfMobile);
System.out.println(tempMobile);
if(tempMobile.equals("Nokia N95"))
{
System.out.println("Nokia N95 index no "+indexOfMobile);
}
}
}
}