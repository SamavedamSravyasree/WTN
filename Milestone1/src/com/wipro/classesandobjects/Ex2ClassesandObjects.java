package com.wipro.classesandobjects;

class Calculator{
	static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2) {
		return Math.pow(num1, num2);
	}
}
public class Ex2ClassesandObjects {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	double c=Double.parseDouble(args[2]);
	int d=Integer.parseInt(args[3]);
	
	System.out.println(Calculator.powerInt(a, b));
	System.out.println(Calculator.powerDouble(c, d));
}
}
