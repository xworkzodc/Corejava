class CoronaVaccine {
static String center;

static String findVaccinationCenter(String area)
{
center="NA";
if(area.equals("Sheshadripuram"))
{
String sheshadripuramArea="Apollo Hospital";
center=sheshadripuramArea;
System.out.println("center= " + center + " area= "+area);
}
if(area.equals("Basavanagudi"))
{
String basavanagudiArea="Bangalore Hospital";
center=basavanagudiArea;
System.out.println("center= " + center + " area= "+area);
}
if(area.equals("Kengeri"))
{
String kengeriArea="BGS Hospital";
center=kengeriArea;
System.out.println("center= " + center + " area= "+area);
}
if(area.equals("Whitefield"))
{
String whitefieldArea="Columbia Asia Hospital";
center=whitefieldArea;
System.out.println("center= " + center + " area= "+area);
}
if(area.equals("Koramangala"))
{
String koramangalaArea="HCG Hospital";
center=koramangalaArea;
System.out.println("center= " + center + " area= "+area);
}
if(area.equals("Vittal Mallya Road"))
{
String vittalMallyaRoadArea="Mallya Hospital";
center=vittalMallyaRoadArea;
System.out.println("center= " + center + " area= "+area);
}
if(center.equals("NA"))
{
System.out.println("Not found");
}
return center;
}

static void displayCenter()
{
System.out.println("Center "+ center);
}

}