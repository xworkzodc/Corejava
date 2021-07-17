class Airplane {
	String flightNo;
	String flightName;
	double fuealCapacity;
	int seat;
	Airhostess[] airhostess;
	
	Airplane (String flightNo,String flightName,double fuealCapacity,int seat)
	{
		this.flightNo=flightNo;
		this.flightName=flightName;
		this.fuealCapacity=fuealCapacity;
		this.seat=seat;
	}
	
	void initAirhostess(Airhostess[] airhostess)
	{
		this.airhostess=airhostess;
	}
	
    void displayProperties()
	{
		System.out.println("Airplane flightNo "+this.flightNo);
		System.out.println("Airplane flightName "+this.flightName);
		System.out.println("Airplane fuealCapacity "+this.fuealCapacity);
	System.out.println("Airplane seat "+this.seat);
		for (int index=0; index<this.airhostess.length; index++)
		{
		this.airhostess[index].displayProperties();
		}
	}
	
}
		
		