class SpeakerTester{
	
	public static void main(String[] args)
	{
	Speaker sound=new Speaker();
	sound.manfCountry="USA";
	System.out.println("COUNTRY: "+ sound.manfCountry);
	sound.color=SpeakerColor.RED;
	System.out.println("SpeakerColor: "+ sound.color);
	sound.working=true;
	System.out.println("working: "+ sound.working);
	
	Speaker sound1=new Speaker();
	sound1.manfCountry="INDIA";
	System.out.println("COUNTRY: "+ sound1.manfCountry);
	sound1.color=SpeakerColor.BLACK;
	System.out.println("SpeakerColor: "+ sound1.color);
	sound1.working=true;
	System.out.println("working: "+ sound1.working);

	Speaker sound2=new Speaker();
	sound2.manfCountry="FRANCE";
	System.out.println("COUNTRY: "+ sound2.manfCountry);
	sound2.color=SpeakerColor.WHITE;
	System.out.println("SpeakerColor: "+ sound2.color);
	sound2.working=false;
	System.out.println("working: "+ sound2.working);

	Speaker sound3=new Speaker();
	sound3.manfCountry="GERMANY";
	System.out.println("COUNTRY: "+ sound3.manfCountry);
	sound3.color=SpeakerColor.RED;
	System.out.println("SpeakerColor: "+ sound3.color);
	sound3.working=true;
	System.out.println("working: "+ sound3.working);
	
	Speaker sound4=new Speaker();
	sound4.manfCountry="JAPAN";
	System.out.println("COUNTRY: "+ sound4.manfCountry);
	sound4.color=SpeakerColor.WHITE;
	System.out.println("SpeakerColor: "+ sound4.color);
	sound4.working=true;
	System.out.println("working: "+ sound4.working);

	Speaker sound5=new Speaker();
	sound5.manfCountry="CHINA";
	System.out.println("COUNTRY: "+ sound5.manfCountry);
	sound5.color=SpeakerColor.BLACK;
	System.out.println("SpeakerColor: "+ sound5.color);
	sound5.working=false;
	System.out.println("working: "+ sound5.working);

	Speaker sound6=new Speaker();
	sound6.manfCountry="SOUTH AFRICA";
	System.out.println("COUNTRY: "+ sound6.manfCountry);
	sound.color=SpeakerColor.RED;
	System.out.println("SpeakerColor: "+ sound6.color);
	sound6.working=true;
	System.out.println("working: "+ sound6.working);


	Speaker sound7=new Speaker();
	sound7.manfCountry="WEST INDIES";
	System.out.println("COUNTRY: "+ sound7.manfCountry);
	sound7.color=SpeakerColor.WHITE;
	System.out.println("SpeakerColor: "+ sound7.color);
	sound7.working=true;
	System.out.println("working: "+ sound7.working);

	Speaker sound8=new Speaker();
	sound8.manfCountry="SINGAPORE";
	System.out.println("COUNTRY: "+ sound8.manfCountry);
	sound8.color=SpeakerColor.RED;
	System.out.println("SpeakerColor: "+ sound8.color);
	sound8.working=false;
	System.out.println("working: "+ sound8.working);	
		
	Speaker sound9=new Speaker();
	sound9.manfCountry="NEW ZEALAND";
	System.out.println("COUNTRY: "+ sound9.manfCountry);
	sound9.color=SpeakerColor.BLACK;
	System.out.println("SpeakerColor: "+ sound9.color);
	sound9.working=true;
	System.out.println("working: "+ sound9.working);		
		
		
	}
}