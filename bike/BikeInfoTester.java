class BikeInfoTester {
public static void main(String[] args)
{
BikeInfo.displayAll();
int mileage=40;
Model model=Model.yamaha_R15;
BikeCc cc= BikeCc.A155cc;
BikeInfo.setInfo("yamaha",185000,cc,mileage,model);
BikeInfo.displayAll();
}
}