package com.wipro.strings;

public class Ex6Strings {
public static void main(String[] args) {
	if(args.length==2) {
	String s1=args[0];
	String s2=args[1];
	int a=s1.length();
	int b=s2.length();
	 if(a<b) {
		System.out.println(s1+s2+s1);
	}
	
	else {
		System.out.println(s2+s1+s2);
	}
}
	else {
		String s1=args[0];
		System.out.println(s1);
	}
}
}
