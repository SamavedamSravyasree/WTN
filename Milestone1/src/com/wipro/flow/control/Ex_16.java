package com.wipro.flow.control;

public class Ex_16 {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int r,x=0;
	while(a>=0) {
		r=a%10;
	    x=x*10+r;
		a=a/10;
	}
	System.out.println(x);
}
}
