class Military{
	String country;
	long capacity;
    MilitaryType type;
	String foundDate;
	
	
	Military(String country,long capacity,MilitaryType type,String foundDate)
		{
		this.country=country;
		this.capacity = capacity;
		this.type=type;
		this.foundDate=foundDate;
		}
	
	@Override
		public String toString()
		{
		System.out.print("country:"+this.country+",");
		System.out.print("capacity:"+this.capacity+",");
		System.out.print("type:"+this.type+",");
		System.out.print("foundDate:"+this.foundDate+",");
		return "Military";
		}
	
	@Override
		public int hashCode()
		{
		return 66;
		}	
	
	
	@Override
		public boolean equals(Object ref)
		{
		if(ref==null)return false;
		if(ref instanceof Military)
		{
			Military instance = (Military)ref;
			String country = instance.country;
			
			if(this.country.equals(country))
			{
				System.out.println("equal");
				return true;
			}
		}
		
		else
		{
			System.out.println("not found");
		}
	           return false;	
	}
}