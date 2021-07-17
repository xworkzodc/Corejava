class EarPhoneTester
{
public static void main(String[] args)
{
EarPhone.sound();
EarPhone.color= "red";
EarPhone.price= 1111;
EarPhone.connected=true;
EarPhone.sound();
EarPhone.connected=false;
EarPhone.sound();
}
}
