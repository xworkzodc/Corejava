class Sport{
	String name;
	String[] sponsors;
	String originatedCountry;
	String mostPlayed;
	Player[] players;
	
	Sport(String name,String originatedCountry,String mostPlayed)
	{
		this.name=name;
		this.originatedCountry=originatedCountry;
		this.mostPlayed=mostPlayed;
	}
	
	void initSponsors(String[] sponsors)
	{
		this.sponsors=sponsors;
	}
	void initPlayer(Player[] players)
	{
		this.players=players;
	}
	
	void displayProperties()
	{
		System.out.println("Sport name "+this.name);
		System.out.println("originatedCountry "+this.originatedCountry);
		System.out.println("mostPlayed "+this.mostPlayed);
		System.out.println("Sponsors list");
		for(int index=0; index<sponsors.length; index++)
		{
			System.out.println(sponsors[index]);
		}
		for(int i=0; i<players.length; i++)
		{
		 this.players[i].displayProperties();
		}
	}
}