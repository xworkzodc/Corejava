class Shift {
public static void main (String[] args) {

// 4 ---> 100 -> 1 shift 1000 -> 2 shift 10000
// 8 ---> 1000 -> 1 shift 0100 -> 2 shift 0010 -> 3 shift 0001 -> 1


int a = 4;
int b = 8;
a<<=2;
b>>=3;
System.out.println("a = " +a);
System.out.println("b = " +b);
}
}