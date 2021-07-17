class ApplicationTester{
public static void main(String[] args)
{

Application.displayApplication();
Application.addApplication("Whatsapp");
Application.addApplication("Instagram");
Application.addApplication("PhonePe");
Application.addApplication("Hotstar");
Application.addApplication("Zee5");
Application.addApplication("Prime Video");
Application.addApplication("Chrome");
Application.addApplication("Thop TV");
Application.addApplication("Gmail");
Application.addApplication("PUBG");

Application.displayApplication();
Application.displayApplicationAtIndex(2);
Application.printFoundIfApplication("Prime Video");
}
}