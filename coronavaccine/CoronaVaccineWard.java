class CoronaVaccineWard
{
static int ward;
static void findVaccinationCenter(int wardNo)
{
if (wardNo==1 )
{
CoronaVaccine.center="Apollo Hospital";

ward=wardNo;
System.out.println("Apollo Hospital Ward No " + ward + "Center: " +CoronaVaccine.center + " Area: Sheshadripuram" );
}
if (wardNo==2)
{
CoronaVaccine.center="Bangalore Hospital";
ward=wardNo;
System.out.println("Bangalore Hospital Ward No " + ward + "Center: " +CoronaVaccine.center + " Area: Basavanagudi");
}
if (wardNo==3)
{
CoronaVaccine.center="BGS Hospital";
ward=wardNo;
System.out.println(" BGS Hospital " + ward + "Center: " +CoronaVaccine.center + " Area: Kengeri");
}
if (wardNo==4)
{
CoronaVaccine.center="Columbia Asia Hospital";
ward=wardNo;
System.out.println("Columbia Asia Hospital Ward No " + ward + "Center: " +CoronaVaccine.center + " Area: Whitefield");
}
if (wardNo==5)
{
CoronaVaccine.center="HCG Hospital";
ward=wardNo;
System.out.println("HCG Hospital Ward No " + ward + "Center: " +CoronaVaccine.center + " Area: Koramangala");
}
if (wardNo==6)
{
CoronaVaccine.center="Mallya Hospital";
ward=wardNo;
System.out.println("Mallya Hospital Ward No " + ward + " Center: " +CoronaVaccine.center + " Area:Vittal Mallya Road" );
}
if (wardNo>=7 || wardNo<=0)
{
ward=wardNo;
System.out.println("Not found!!!!");
}

}
}