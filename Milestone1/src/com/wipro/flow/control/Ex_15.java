package com.wipro.flow.control;

public class Ex_15 {
public static void main(String[] args) {
	int s=args.length;
	if(s==0) {
		System.out.println("Please enter a integer number");
	}
	else {
		int a=Integer.parseInt(args[0]);
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
}
