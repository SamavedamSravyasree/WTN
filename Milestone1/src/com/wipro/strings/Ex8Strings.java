package com.wipro.strings;

public class Ex8Strings {
public static void main(String[] args) {
	String s1=args[0];
	int a=s1.length();
	int s=s1.indexOf('*');
	System.out.println(s1.substring(0, s-1)+s1.substring(s+2, a));
}
}
