package com.wipro.arrays;

public class Ex_4arrays {
public static void main(String[] args) {
	int s=args.length;
	int i;
	int[] arr=new int[s];
	for( i=0;i<s;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;	
	}
	String st=null;
	for(int j:arr) {
		st=Character.toString((char)j);
		System.out.print(st+" ");
	}
	
}
}
