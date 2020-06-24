package com.wipro.inheritance;
class Animal{
void eat(){
System.out.println("eat method-Animal");
}
void sleep(){
System.out.println("Sleep method-Animal");
}
}

class Bird extends Animal{
void eat(){
System.out.println("eat method-Bird");
}
void sleep(){
System.out.println("Sleep method-Bird");
}
void fly(){
System.out.println("fly method-Bird");
}
}
public class Ex1Inheritance {
	public static void main(String args[]){
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
}
}
