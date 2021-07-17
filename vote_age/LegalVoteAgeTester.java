class LegalVoteAgeTester{
public static void main(String[] args){
	
LegalVoteAge validator=new LegalVoteAge();
try{
boolean valid  =  validator.validateVoteAge(18);
System.out.println(valid);
}
catch(InvalidVoteAgeException e)
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