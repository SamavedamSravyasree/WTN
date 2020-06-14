package com.wipro.arrays;

public class Ex_11 {
public static void main(String[] args) {
	int s=args.length;
	int f,i;
	int[] arr=new int[s];
	for( i=0;i<s;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;
		
	}
	f=0;
	for(i=0;i<s;i++) {
		
		if(arr[i]==1 || arr[i]==4) {
			continue;
		}
		else {
			f=1;
			break;
		}
		
	}
	if(f==1) {
		System.out.print("false");
	}
	else {
		System.out.print("true");
	}
	
}
}
