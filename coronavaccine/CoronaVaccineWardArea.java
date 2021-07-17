class CoronaVaccineWardArea{

static void findVaccinationCenter(int wardNo, String area)
{

if(area.equals("Sheshadripuram") && (wardNo==1))
{
CoronaVaccine.center="Apollo Hospital";
System.out.println("center= " +CoronaVaccine.center + " area= "+area);
}

if(area.equals("Basavanagudi") && (wardNo==2))
{
CoronaVaccine.center="Bangalore Hospital";
System.out.println("center= " + CoronaVaccine.center + " area= "+area);
}
if(area.equals("Kengeri") && (wardNo==3))
{
CoronaVaccine.center="BGS Hospital";
System.out.println("center= " + CoronaVaccine.center + " area= "+area);
}
if(area.equals("Whitefield") && (wardNo==4))
{
CoronaVaccine.center="Columbia Asia Hospital";
System.out.println("center= " + CoronaVaccine.center + " area= "+area);
}
if(area.equals("Koramangala") && (wardNo==5))
{
CoronaVaccine.center="HCG Hospital";
System.out.println("center= " + CoronaVaccine.center + " area= "+area);
}
if(area.equals("Vittal Mallya Road") && (wardNo==6))
{
CoronaVaccine.center="Mallya Hospital";
System.out.println("center= " + CoronaVaccine.center + " area= "+area);
}
}
}