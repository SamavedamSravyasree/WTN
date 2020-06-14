package com.wipro.flow.control;

public class Argumentlength {
public static void main(String[] args) {
	int s=args.length;
	if(s==0) {
		System.out.println("No value");
	}
	else {
		for(int i=0;i<s-1;i++) {
			System.out.print(args[i]);
			System.out.print(",");
		}
		System.out.println(args[s-1]);
	}
}
}
