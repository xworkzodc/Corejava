class GroceryShop extends Shop{
	boolean largeScale;
	double profit;
	String packageType;
	String customerFeedBack;
	boolean onlineDelivery;
	String[] isoCertifiedIteams;
	
	GroceryShop(String name, String ownerName, String location, String gstNo)
	{
		super.name=name;
		super.ownerName=ownerName;
		super.location=location;
		super.gstNo=gstNo;
	}
	
	void setLargeScale(boolean largeScale)
	{
		this.largeScale=largeScale;
	}
	void setPackageType(String packageType)
	{
		this.packageType=packageType;
	}
	void setOnlineDelivery(boolean onlineDelivery)
	{
		this.onlineDelivery=onlineDelivery;
	}
	void setProfit(double profit)
	{
		this.profit=profit;
	}
	void  setCustomerFeedBack(String customerFeedBack)
	{
		this.customerFeedBack=customerFeedBack;
	}
	void setIsoCertifiedIteams(String[] isoCertifiedIteams)
	{
		this.isoCertifiedIteams=isoCertifiedIteams;
	}
	
	void displayIsoCertifiedIteams()
	{
		for(int index=0; index<this.isoCertifiedIteams.length; index++)
		{
			System.out.println("ISO certified iteams "+this.isoCertifiedIteams[index]);
		}
	}
	void onlineDelivery()
	{
		System.out.println("online Delivery available");
	}
	
	
	String getName()
	{
		return super.name;
	}
	String getLocation()
	{
		return super.location;
	}
	boolean getWholeSale()
	{
		return super.wholeSale;
	}
	double getProfit()
	{
		return this.profit;
	}
	String getPackageType()
	{
		return this.packageType;
	}
	String getCustomerFeedback()
	{
		return customerFeedBack;
	}
	
	void displayProperties()
	{
		System.out.println("largeScale "+this.largeScale);
		System.out.println("profit "+this.profit);
		System.out.println("packageType "+this.packageType);
		System.out.println("onlineDelivery "+this.onlineDelivery);
		System.out.println("customerFeedBack "+this.customerFeedBack);
		displayIsoCertifiedIteams();
		super.displayProperties();
	}
}
	
	