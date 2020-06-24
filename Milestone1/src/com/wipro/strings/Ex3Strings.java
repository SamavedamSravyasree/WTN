package com.wipro.strings;

public class Ex3Strings {
public static void main(String[] args) {
	String s1=args[0];
	int a=s1.length();
	for(int i=0;i<a;i++) {
		System.out.print(s1.substring(0, 2));
	}
}
}
