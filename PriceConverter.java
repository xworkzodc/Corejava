class PriceConverter{
	
public static void main(String[] values)
{
if(values.length>=4)
{
	String bookPrice=values[0];
	byte convertBookPrice=Byte.parseByte(bookPrice);
	System.out.println("byte:  BookPrice "+ convertBookPrice);
	
	String maskPrice=values[1];
	short convertMaskPrice=Short.parseShort(maskPrice);
	System.out.println("short:  MaskPrice "+ convertMaskPrice);
	
	String waterBottlePrice=values[2];
	int convertWaterBottlePrice=Integer.parseInt(waterBottlePrice);
	System.out.println("int:  waterBottlePrice "+ convertWaterBottlePrice);
	
	String penPrice=values[3];
	System.out.print("char:  penPrice ");
	for(int price=0; price<penPrice.length(); price++)
	{
	char convertPenPrice=penPrice.charAt(price);
	System.out.print(convertPenPrice);
	}
	System.out.println();
	
	String bikePrice=values[4];
	long convertBikePrice=Long.parseLong(bikePrice);
	System.out.println("long:  BikePrice "+ convertBikePrice);
	
	String earPhonePrice=values[5];
	float convertEarPhonePrice=Float.parseFloat(earPhonePrice);
	System.out.println("float:  earPhonePrice "+ convertEarPhonePrice);
	
	String mobilePrice=values[6];
	double convertMobilePrice=Double.parseDouble(mobilePrice);
	System.out.println("double:  MobilePrice "+ convertMobilePrice);
	
	String wirePrice=values[7];
	boolean convertWirePrice=Boolean.parseBoolean(wirePrice);
	System.out.println("Boolean "+ convertWirePrice);
	
}
else
{
	System.out.println("You should pass arguments");
}
}
}