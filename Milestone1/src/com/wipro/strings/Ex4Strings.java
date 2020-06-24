package com.wipro.strings;

public class Ex4Strings {
public static void main(String[] args) {
	String s1=args[0];
	int a=s1.length();
	if(a%2==0) {
		System.out.println(s1.substring(0, a/2));
	}
	else {
		System.out.println("null");
	}
}
}
