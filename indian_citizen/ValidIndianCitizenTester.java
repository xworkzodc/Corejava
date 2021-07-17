class ValidIndianCitizenTester{
public static void main(String[] args){
	
ValidIndianCitizen validator=new ValidIndianCitizen();
try{
boolean valid  =  validator.validateIndianCitizen("Sachin","Davanagere","Senior citizen","age 60");
System.out.println(valid);
}
catch(InvalidIndianCitizenException e)
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