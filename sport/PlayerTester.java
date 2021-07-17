class PlayerTester{
	
	public static void main(String[] args)
	{
		String[] club=new String[2];
		club[0]="Mumbai";
		club[1]="Bangalore";
		Player player= new Player("Rohit Sharma", 120,45,14);
		player.initClubRepresented(club);
		player.displayProperties();
	}
}