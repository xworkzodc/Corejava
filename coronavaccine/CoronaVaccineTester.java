class CoronaVaccineTester {

public static void main(String[] args)
{
CoronaVaccine.findVaccinationCenter("Kengeri");
CoronaVaccine.displayCenter();
CoronaVaccineWard.findVaccinationCenter(4);
CoronaVaccine.displayCenter();
CoronaVaccineAreaWard.findVaccinationCenter("Basavanagudi",2);
CoronaVaccine.displayCenter();
CoronaVaccineWardArea.findVaccinationCenter(6, "Vittal Mallya Road");
CoronaVaccine.displayCenter();
}
}