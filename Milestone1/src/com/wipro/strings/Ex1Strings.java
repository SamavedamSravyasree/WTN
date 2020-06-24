package com.wipro.strings;

public class Ex1Strings {
	public static void main(String[] args) 
	{
		String s=args[0];
		int n=s.length();
		int i;
		for(i=0;i<(n/2);i++)
		{
			if(s.charAt(i)!=s.charAt(n-1-i))
			{
				System.out.println(s+" is Not Palindrome");
				return;
			}
		}
		System.out.println(s+" is Palindrome");
	}
}
