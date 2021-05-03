class Student {
String name;
String gender;
String qualification;

void S() {
System.out.println( name + " is " + gender);
}

void Sa() {
System.out.println( name + " completed " + qualification);
System.out.println( "");
}

public static void main (String[] args) {
Student Akshay = new Student();
Akshay.name= "Akshay";
Akshay.gender="male";
Akshay.qualification="Bsc";

Student Sanvi = new Student();
Sanvi.name= "Sanvi";
Sanvi.gender="female";
Sanvi.qualification="MSC";

Student Rakesh = new Student();
Rakesh.name= "Rakesh";
Rakesh.gender="male";
Rakesh.qualification="MCA";

Student Sanjana = new Student();
Sanjana.name= "Sanjana";
Sanjana.gender="female";
Sanjana.qualification="BE";

Student Sachin = new Student();
Sachin.name= "Sachin";
Sachin.gender="male";
Sachin.qualification="Mtech";

Akshay.S();
Akshay.Sa();
Sanvi.S();
Sanvi.Sa();
Sanjana.S();
Sanjana.Sa();
Rakesh.S();
Rakesh.Sa();
Sachin.S();
Sachin.Sa();
}
}
