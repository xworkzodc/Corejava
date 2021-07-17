class LegalVoteAge{
	
	boolean validateVoteAge(int age)throws InvalidVoteAgeException
	{
		System.out.println("running validateVoteAge ");
	if(age>=18)
	{
		return true;
	}
	InvalidVoteAgeException customCheckedExp=new InvalidVoteAgeException();
	throw customCheckedExp;
	}
}