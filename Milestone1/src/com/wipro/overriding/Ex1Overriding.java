package com.wipro.overriding;
class Fruit{
	String name;
	String taste;
	int size;
	void eat() {
		System.out.println("name of fruit");
		System.out.println("Taste");
	}
}
class Apple{
	void eat() {
		System.out.println("Name - Apple");
		System.out.println("Taste - Sweet");
	}
}
class Orange{
	void eat() {
		System.out.println("Name - Orange");
		System.out.println("Taste - Sweet tart");
	}
}
public class Ex1Overriding {
public static void main(String[] args) {
	Apple a=new Apple();
	a.eat();
	Orange o=new Orange();
	o.eat();
}
}
