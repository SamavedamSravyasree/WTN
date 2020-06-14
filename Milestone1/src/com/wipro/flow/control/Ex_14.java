package com.wipro.flow.control;

public class Ex_14 {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int r,x=0;
	for(int i=a;i>0;i--) {
		r=a%10;
		x=x+r;
		a=a/10;
	}
	System.out.println(x);
}
}
