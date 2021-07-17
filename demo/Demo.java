class Demo{
	int age;
	String name;
	
	Demo()
	{
	}
	Demo(int age)
	{
		this.age=age;
		setName("name");//method
		initName();//method
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	void initName()
	{
		Demo demo=new Demo();
		System.out.println("name "+name+age+demo);
		Demo1 done=new Demo1("DVG",5);
		done.initLocation();//method of sub class 
	}
}