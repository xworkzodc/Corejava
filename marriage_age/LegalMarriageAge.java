class LegalMarriageAge{

	enum Gender
	{
		MALE,FEMALE;
	}
	
	boolean validateAge(Gender gender, int age)throws LegalMarriageAgeException
	{
		System.out.println("running validateage ");
	if(gender.equals(Gender.MALE) && (age>=21)) 
	{
		return true;
	}
	if(gender.equals(Gender.FEMALE) && (age>=18))
	{	
		return true;
	}
	LegalMarriageAgeException customCheckedExp=new LegalMarriageAgeException();
	throw customCheckedExp;
	}
}