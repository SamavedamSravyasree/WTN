package com.wipro.flow.control;

public class Ex_17 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int r,x=0,z;
		z=a;
		while(a>0) {
			r=a%10;
		    x=x*10+r;
			a=a/10;
		}
		if(x==z) {
			System.out.println(a +" is a palindrome");
		}
		else {
		System.out.println(a +" is not a palindrome");	
		}
	}
}
