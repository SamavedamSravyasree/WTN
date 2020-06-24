package com.wipro.strings;

public class Ex9Strings {
public static void main(String[] args) {
	String s1=args[0];
	String s2=args[1];
	String s="";
	int a=s1.length();
	int b=s2.length();
	int i;
	int len=a>b?b:a;
	for(i=0;i<len;i++) {
		s+=s1.charAt(i);
		s+=s2.charAt(i);
	}
	if(a>b) {
		for(i=len;i<a;i++) {
			s+=s1.charAt(i);
		}
	}
	if(b>a) {
		for(i=len;i<b;i++) {
			s+=s2.charAt(i);
		}
	}
	System.out.println(s);
}
}
