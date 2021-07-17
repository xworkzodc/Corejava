class PersonInfoTester {
public static void main(String[] args)
{
PersonInfo.displayAll();
long phoneNum=8095946885l;
Gender gender=Gender.MALE;
PersonInfo.setInfo("sachin",phoneNum,gender,PersonStatus.SINGLE);
PersonInfo.displayAll();
}
}