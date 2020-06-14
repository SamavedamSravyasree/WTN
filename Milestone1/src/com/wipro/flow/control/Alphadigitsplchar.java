package com.wipro.flow.control;

public class Alphadigitsplchar {
public static void main(String[] args) {
	char c=args[0].charAt(0);
	if(c>='a' && c<='z' || c>'A' && c<='Z') {
		System.out.print("Alphabet");
	}
	else if(c>='0' && c<='9') {
		System.out.print("Digit");
	}
	else {
		System.out.print("Special Character");
	}
	
}
}
