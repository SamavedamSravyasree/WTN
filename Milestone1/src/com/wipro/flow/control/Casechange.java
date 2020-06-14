package com.wipro.flow.control;

public class Casechange {
public static void main(String[] args) {
	char c=args[0].charAt(0);
	if(c>='a' && c<='z') {
		System.out.println(Character.toUpperCase(c));
	}
	if(c>'A' && c<='Z') {
		System.out.println(Character.toLowerCase(c));
	}
}
}

