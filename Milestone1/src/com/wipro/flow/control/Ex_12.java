package com.wipro.flow.control;

public class Ex_12 {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int c=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0) {
			c++;
		}
	}
	if(c==2) {
		System.out.print("Prime");
	}
	else {
		System.out.print("Not prime");
	}
}
}
