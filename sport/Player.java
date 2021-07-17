class Player{
	String name;
	int noOfGamesPlayes;
	int jerseyNo;
	int yearsOfExp;
	String[] clubsRepresented;
	
	Player(String name,int noOfGamesPlayes,int jerseyNo,int yearsOfExp)
	{
		this.name=name;
		this.noOfGamesPlayes=noOfGamesPlayes;
		this.jerseyNo=jerseyNo;
		this.yearsOfExp=yearsOfExp;
	}
	
	void initClubRepresented(String[] clubsRepresented)
	{
		this.clubsRepresented=clubsRepresented;
	}
	
	void displayProperties()
	{
		System.out.println("player name "+this.name);
		System.out.println("noOfGamesPlayes "+this.noOfGamesPlayes);
		System.out.println("jerseyNo "+this.jerseyNo);
		System.out.println("yearsOfExp "+this.yearsOfExp);
		System.out.println("Club list");
		for(int index=0; index<clubsRepresented.length; index++)
		{
			System.out.println(clubsRepresented[index]);
		}
	}
}