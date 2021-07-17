class StringTester{
	
	public static void main(String[] args)
	{
		
		String name="SACHIN";
		System.out.println(name.concat(" G M"));
		System.out.println(name.toLowerCase());	
		
		String song="Dont worry";
		System.out.println(song.equalsIgnoreCase("Dont worry"));
		System.out.println(song.isEmpty());
		System.out.println(song.substring(2,8));
		System.out.println(song.toUpperCase());
		

		String actor="dolly dhananjay";
		int index=actor.indexOf("y");
		System.out.println(index);
		
		String match=" India vs New Zealand ";
		System.out.println(match.length());
		System.out.println(match.trim().length());
		match=match.replace(" ","*");
		System.out.println(match);
		
		String movie="Love Mocktail";
		char[]ch=movie.toCharArray();
		int leng=ch.length;
		System.out.println("Char length:" + leng);
		System.out.println("Char Elements");	
		for(int i=0;i<leng;i++)
		{
		System.out.println(ch[i]);
		}
		
		String word="Good Morning";
		System.out.println(word.trim()+" asdf");	
		System.out.println(word);
		
		String name1 = "Akshay";
		char name2 = name1.charAt(4);
		System.out.println(name2);	
		
		String game="BATTLEGROUNDS MOBILE INDIA";  
		System.out.println(game.contains("s"));  
		System.out.println(game.contains("MOBILE"));  
		System.out.println(game.contains("GLOBAL")); 

		String pubg = "BATTLEGROUNDS MOBILE INDIA Early Access version is now available on Google Play Store";
		System.out.println(pubg.endsWith("Early"));   
		System.out.println(pubg.endsWith("Store"));  
	}
}