class LegalMarriageAgeTester{
public static void main(String[] args){
	
LegalMarriageAge v= new LegalMarriageAge();
try{
boolean valid  =  v.validateAge(LegalMarriageAge.Gender.FEMALE,28);
System.out.println(valid);
}
catch(LegalMarriageAgeException e)
{
System.out.println("this  is validated ");
e.printStackTrace();
}
catch(Exception exp)
{
System.out.println("Generic handler");
}
finally{
	System.out.println("invoked finally ");
}
}
}