class Primitive{
public static void main(String[] args)
{	
 short number1 =12;
 Short number2 =new Short("13");
 if(number1==number2)
	{
	System.out.println("Short dataType: same");
	}
else
	{
	System.out.println("Short dataType: not same");
	}
	
  byte number3=66;
  Byte number4=new Byte("66");
 if(number4==number3) 
	{
	System.out.println("Byte dataType: same");
	}
 else
	{
	System.out.println("not same");
	}	

 int number5=998;
 Integer number6=new Integer("999");
 if(number5==number6) 
 {
 System.out.println("Int dataType: same");
 }
 else{
 System.out.println("Int dataType: not same");
 } 
 
  long number7=8095946885l;
  Long number8= new Long("9148755841");
  if(number7==number8)
	{
	System.out.println("Long dataType: same");
	}
else
	{
	System.out.println("Long dataType: not same");
	}

  float num1=0.1f;
  Float num2= new Float("0.2f");
  if(num1==num2)
	{
	System.out.println("Float dataType: same");
	}	
else
	{
	System.out.println("Float dataType: not same");
	}
	
  double num3=50.5d;
  Double num4= new Double("60.67");
  if(num3==num4)
	{
	System.out.println("Double dataType: same");
	}
  else
	{
	System.out.println("Double dataType: not same");
	}
	
  char name='J';
  Character name1= new Character('J');
  if(name==name1)
	{
	System.out.println("Char :same");
	}
	else
	{
	System.out.println("Char : not same");
	}	
	
 boolean yes=true;
 Boolean no=new Boolean (false);
 if(yes==no)
	{
	System.out.println("Boolean :same");
	}
	else
	{
	System.out.println("Boolean : not same");
	}
}
}