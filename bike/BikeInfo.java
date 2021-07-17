class BikeInfo {

static String brand;
static int price;
static Model model;
static BikeCc cc;
static int mileage;

static void setInfo( String newBrand, int newPrice, BikeCc newCc, int newMileage, Model newModel)
{
System.out.println("invoke setInfo");
System.out.println(newBrand);
System.out.println(newPrice);
System.out.println(newCc);
System.out.println(newMileage);
System.out.println(newModel);
brand=newBrand;
price=newPrice;
cc=newCc;
mileage=newMileage;
model=newModel;
return;
}

static void displayAll()
{
System.out.println("invoke displayAll");
System.out.println(brand);
System.out.println(price);
System.out.println(cc);
System.out.println(mileage);
System.out.println(model);
return;
}

}