class Hall{
	int no;
	int totalSeats;
	boolean ac;
	
	Hall(int no,int totalSeats,boolean ac)
	{
		this.no=no;
		this.totalSeats=totalSeats;
		this.ac=ac;
	}
	
	void displayHall()
	{
		System.out.println("hall no "+this.no);
		System.out.println("hall totalSeats "+this.totalSeats);
		System.out.println("hall ac "+this.ac);
	}
}