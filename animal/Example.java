class Animal {  
String color;  
Animal(String color){  
this.color = color;  
}  
void eat(String name) {  
System.out.println(name + " is eating .....");  
}  
void show(String name) {  
System.out.println(name + " is of " + color + " Color");  
}  
}  
class Dog extends Animal{  
Dog(String color) {  
super(color);  
// TODO Auto-generated constructor stub  
}  
void eat(String name) {  
System.out.println(name + " is eating ....");  
}  
}  
  
