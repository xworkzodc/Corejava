class MainMethod{
	public static void main(String[] arguments)
	{
		if(arguments.length>=3)
		{
			String firstArg=arguments[2];
			System.out.println(firstArg);
		}
		System.out.println(arguments.length);
		for (int mainArugmenIndex=0; mainArugmenIndex<arguments.length; mainArugmenIndex++)
		{
			    System.out.println(arguments[mainArugmenIndex]);
				String arg=arguments[mainArugmenIndex];
				TravelAgency.addAgency(arg);
		}
	}
}