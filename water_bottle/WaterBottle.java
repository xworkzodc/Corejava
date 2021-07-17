class WaterBottle{
static String brand;
static int quantity;
static boolean thermoFlask;

static void  changeBrand(String newBrand) 
{
brand="kinley";
System.out.println(newBrand);
System.out.println("brand before change "+brand);
brand=newBrand;
System.out.println("brand after change " +brand);
}

static void  changeQuantity(int newQuantity)
{
System.out.println(newQuantity);
System.out.println("wireless before change "+quantity);
quantity=newQuantity;
System.out.println("wireless after change " +quantity);

}


static void  changeThermoFlask(boolean newThermoFlask) {
System.out.println(newThermoFlask);
System.out.println("thermoflask before change "+thermoFlask);
thermoFlask=newThermoFlask;
System.out.println("thermoflask after change " +thermoFlask);
}


static void  printBrand()
{
System.out.println(brand);
}


static void  printQuantity()
{
System.out.println(quantity);
}

static void  printThermoFlask()
{
System.out.println(thermoFlask);
}

static void  displayAll()
{
printBrand();
printQuantity();
printThermoFlask();
}


}





