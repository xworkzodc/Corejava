class WaterBottleTester {

public static void main(String[] args)   {
WaterBottle.displayAll();
String brandName="bisleri";
WaterBottle.changeBrand(brandName);
int litre=10;
WaterBottle.changeQuantity(litre);
boolean flask=true;
WaterBottle.changeThermoFlask(flask);
WaterBottle.displayAll();
}
}

