class Demo1 extends Demo{
	String location;
	int number;
	
	Demo1(String location, int age)
	{
		//super();
		super(6);//we can't call 2 super Statement
		//this(4);
		this.location=location;
		super.age=age;//we can call parent properties to sub class
		super.initName();
	}
	
	 //super.initName();
	Demo1(int number)
	{
		this.number=number;
	}
	
	
	void initLocation()
	{
		System.out.println(this.location);
		super.initName();//method of parent class 
		super.setName("Sachin");
		initLocation();
	}
	
	void setName()
	{
	Demo1 don=new Demo1("DVG",6); 
	Demo d=new Demo(3);
	
	}
	
}
		
		