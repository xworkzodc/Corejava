class Tester{

public static void main(String[] args)
{
int volt=Bulb.light();
System.out.println(volt);

String chair=Carpenter.woodWorks();
System.out.println(chair);

String food=DeliveryGuy.delivery();
System.out.println(food);

String soil=Farmer.farming();
System.out.println(soil);

float open=Gym.openTime();
System.out.println(open);

}
}