package com.wipro.strings;

public class Ex2Strings {
	public static void main(String[] args) {
		String s1=args[0];
		String s2=args[1];
		int a=s1.length();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.charAt(a-1)==s2.charAt(0)) {
			a--;
			s1=s1.substring(0, a);
		}
		else {
			a++;
			s1=s1+" ";
		}
		s1=s1+s2;
		System.out.println(s1);

	}

}
