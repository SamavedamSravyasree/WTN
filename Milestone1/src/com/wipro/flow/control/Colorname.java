package com.wipro.flow.control;

public class Colorname {
public static void main(String[] args) {
	char c=args[0].charAt(0);
	switch(c) {
	case 'R':
		System.out.print("Red");
		break;
	case 'B':
		System.out.print("Blue");
		break;
	case 'G':
		System.out.print("Green");
		break;
	case 'O':
		System.out.print("Orange");
		break;
	case 'Y':
		System.out.print("Yellow");
		break;
	case 'W':
		System.out.print("White");
		break;
		default:
			System.out.print("Invalid code");
	}
}
}
