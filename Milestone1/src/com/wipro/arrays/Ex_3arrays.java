package com.wipro.arrays;

public class Ex_3arrays {
public static void main(String[] args) {
	int s=args.length;
	int i;
	int[] arr=new int[s];
	for( i=0;i<s-1;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;	
	}
	int f=0;
	int a=Integer.parseInt(args[s-1]);
	
	for( i=0;i<s;i++) {
		 
		if(arr[i]==a) {
			f=1;
			System.out.println(i);
			break;
		}
		else {
			f=0;
		}
			
	}
	if(f==0) {
		System.out.println("-1");
	}
	
	
}
}
