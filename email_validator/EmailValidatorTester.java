class EmailValidatorTester{
public static void main(String[] args){
	
EmailValidator validator=new EmailValidator();
try{
boolean valid  =  validator.validateEmail("contactgmail.in");
System.out.println(valid);
}
catch(EmailValidatorException e)
{
System.out.println("this  is validated "+ e.getMessage() );
e.printStackTrace();
}
catch(Exception exp)
{
System.out.println("Generic handler");
exp.printStackTrace();
}
}
}