package com.wipro.strings;

public class Ex7Strings {
public static void main(String[] args) {
	String s1=args[0];
	int a=s1.length();
	if(s1.charAt(0)=='x') {
		s1=s1.substring(1,a);
		a--;
	}
	if(s1.charAt(a-1)=='x') {
		s1=s1.substring(0,a-1);
		a--;
	}
	System.out.println(s1);
}
}
