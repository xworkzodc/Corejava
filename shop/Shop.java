class Shop{
	String name;
	String ownerName;
	String location;
	String gstNo;
	double budget;
	double openTime;
	double closeTime;
	int noOfWorkers;
	boolean homeDelivery;
	boolean ambience;
	boolean wholeSale;
	boolean parking;
	ShopType type;
	BillingType billingType;
	
	void initName(String name)
	{
		this.name=name;
	}
	void initOwnerName(String ownerName)
	{
		this.ownerName=ownerName;
	}
	void initLocation(String location)
	{
		this.location=location;
	}
	void initGstNo(String gstNo)
	{
		this.gstNo=gstNo;
	}
	void initBudget(double budget)
	{
		this.budget=budget;
	}
	void initOpenTime(double openTime)
	{
		this.openTime=openTime;
	}
	void initCloseTime(double closeTime)
	{
		this.closeTime=closeTime;
	}
	void initNoOfWorkers(int noOfWorkers)
	{
		this.noOfWorkers=noOfWorkers;
	}
	void initHomeDelivery(boolean homeDelivery)
	{
		this.homeDelivery=homeDelivery;
	}
	void initAmbience(boolean ambience)
	{
		this.ambience=ambience;
	}
	void initWholeSale(boolean wholeSale)
	{
		this.wholeSale=wholeSale;
	}
	void initParking(boolean parking)
	{
		this.parking=parking;
	}
	void initShopType(ShopType type)
	{
		this.type=type;
	}
	void initBillingType(BillingType billingType)
	{
		this.billingType=billingType;
	}
	
	void displayProperties()
	{
		System.out.println("shop name "+this.name);
		System.out.println("Owner name "+this.ownerName);
		System.out.println("Location "+this.location);
		System.out.println("GST no "+this.gstNo);
		System.out.println("Budget "+this.budget);
		System.out.println("Open time "+this.openTime);
		System.out.println("closeTime "+this.closeTime);
		System.out.println("wholeSale "+this.wholeSale);
		System.out.println("noOfWorkers "+this.noOfWorkers);
		System.out.println("homeDelivery "+this.homeDelivery);
		System.out.println("ambience "+this.ambience);
		System.out.println("parking "+this.parking);
		System.out.println("shoptype "+this.type);
		System.out.println("billingType "+this.billingType);
	}
}
		