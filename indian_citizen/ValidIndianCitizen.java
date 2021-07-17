class ValidIndianCitizen{
	
	static boolean validateIndianCitizen(String name,String bornPlace,String ...args)throws InvalidIndianCitizenException 
	{
		System.out.println("running validateIndianCitizen ");
		System.out.println("number of arguments is "+args.length);
		for (String i: args)
		{
			System.out.println(i + " ");
		}
	if(name.equals("Sachin") && (bornPlace.equals("Davanagere") ))
	{
		return true;
	}
	InvalidIndianCitizenException  customCheckedExp=new InvalidIndianCitizenException ();
	throw customCheckedExp;
	}
}