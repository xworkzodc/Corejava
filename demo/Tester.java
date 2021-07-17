class Tester{
	
	public static void main(String[] args)
	{
	
		Demo1 hai=new Demo1("DVG",6); 
		
		hai.initLocation();//StackOverflowError
		
		Demo hello=new Demo1("SMG",4); //upcasting
		
		Demo1 hey=(Demo1)hello;//downCasting
		
	}
}-*