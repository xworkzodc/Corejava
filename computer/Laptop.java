class  Laptop extends Computer{
	double weight;
	boolean camera;
	
	Laptop(double weight, boolean camera)
	{
		super("Dell");
		System.out.println("laptop weight and camera");
		this.weight=weight;
		this.camera=camera;
	}
	
	
	void displayProperties()
	{
		System.out.println(super.brand);
		System.out.println(super.modelNo);
		System.out.println(super.price);
		System.out.println(this.weight);
		System.out.println(this.camera);
	}
}