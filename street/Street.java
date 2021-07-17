class Street
{
	String areaName;
	City city;
	StreetType type;
	
	enum City{
		MYSORE,MANGALORE,DAVANAGERE,SHIVAMOGGA;
	}
	enum StreetType{
		MAIN,HIGHWAY,GALLI,NA;
	}	
		Street(City city)
		{
			this.city=city;
			System.out.println("city name "+ this.city);		
		}
		
	void updateAreaName(String areaName)
	{
		this.areaName=areaName;
		System.out.println("Area name "+this.areaName);
	}	
	
	void updateStreetType()
	{
		if (this.areaName.equals("Chickpet"))
		{
			this.type=StreetType.GALLI;
			System.out.println("street type "+this.type);
			
		}
		else if (areaName.equals("Mysore Road"))
		{
			this.type=StreetType.HIGHWAY;
			System.out.println("street type "+this.type);
		}
		else if (areaName.equals("MG Road"))
		{
			this.type=StreetType.MAIN;
			System.out.println("street type "+this.type);
		}
		else
		{
			this.type=StreetType.NA;
			System.out.println(StreetType.NA);
		}
	}
		
	void printAllInstanceVariable()
	{
		System.out.println("area "+this.areaName);
		System.out.println("city "+this.city);
		System.out.println("type "+this.type);
		
	}
	
}