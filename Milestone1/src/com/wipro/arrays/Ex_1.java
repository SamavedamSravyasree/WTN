package com.wipro.arrays;

public class Ex_1 {
public static void main(String[] args) {
	int s=args.length;
	int i,t=0;
	int[] arr=new int[s];
	for( i=0;i<s;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;	
	}
	for(i=0;i<s;i++) {
		t+=arr[i];
	}
	int a;
	a=t/s ;
	System.out.println("Sum is : "+t);
	System.out.println("Average is : "+a);
}
}
