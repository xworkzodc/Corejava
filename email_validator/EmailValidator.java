class EmailValidator{
	
	boolean validateEmail(String email)throws EmailValidatorException
	{
		System.out.println("running validateEmail ");
	if(email.contains("@") && (email.endsWith(".in") || email.endsWith(".com")))
	{
		return true;
	}
	EmailValidatorException customCheckedExp=new EmailValidatorException();
	throw customCheckedExp;
	}
}