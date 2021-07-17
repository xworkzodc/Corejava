class SportTester{
	
	public static void main(String[] args)
	{
		String[] sponsors=new String[3];
		sponsors[0]="Star Sports";
		sponsors[1]="Dream11";
		sponsors[2]="MRF Tyres";
		
		Sport sport=new Sport("Cricket","India","India");
		sport.initSponsors(sponsors);
		
		String[] club=new String[2];
		club[0]="MCA";
		club[1]="Achievers Cricket Academy";
		Player player1= new Player("Rohit Sharma", 120,45,14);
		player1.initClubRepresented(club);
		
		String[] club1=new String[2];
		club1[0]="DCC";
		club1[1]="Sehwag Cricket Academy";
		Player player2= new Player("Rishabh Pant", 40,77,5);
		player2.initClubRepresented(club1);
		
		Player[] players={player1,player2};
		
		sport.initPlayer(players);
		sport.displayProperties();
	}
}