package com.wipro.exceptionhandling;

class AgeRangeException extends Exception{
	public AgeRangeException() {
		System.out.println("Age not in Range");
	}
}
class B{
	public void NotRange(int age) throws AgeRangeException
	{
		if(age<18 || age>=60) {
			throw new AgeRangeException();
		}
	}
}
public class Exceptions5 {
public static void main(String[] args) {
	B b=new B();
	String name=args[0];
	int a;
	try {
	 a=Integer.parseInt(args[1]);
	}
	catch(Exception e) {
		System.out.println(e);
		return;
	}
	try {
		b.NotRange(a);
	}
	catch(Exception e){
		return;
	}
	System.out.println("Age is valid");
}
}
