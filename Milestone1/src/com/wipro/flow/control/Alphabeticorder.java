package com.wipro.flow.control;

public class Alphabeticorder {
	public static void main(String[] args) {
	char a=args[0].charAt(0);
	
	char b=args[1].charAt(0);
	
	if(a>b) {
		System.out.println(b +","+ a);
	}
	else {
		System.out.println(a+ ","+ b);
	}
}
}
