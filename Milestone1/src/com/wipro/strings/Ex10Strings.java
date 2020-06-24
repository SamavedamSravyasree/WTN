package com.wipro.strings;

public class Ex10Strings {
public static void main(String[] args) {
	String s1=args[0];
	int n=Integer.parseInt(args[1]);
	int a=s1.length();
	for(int i=0;i<n;i++) {
		System.out.print(s1.substring(a-n, a));
	}
	
}
}
