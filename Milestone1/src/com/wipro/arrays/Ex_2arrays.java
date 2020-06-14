package com.wipro.arrays;

public class Ex_2arrays {
public static void main(String[] args) {
	int s=args.length;
	int i;
	int[] arr=new int[s];
	for( i=0;i<s;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;	
	}
	int max=arr[0],min=arr[0];
	for( i=0;i<s;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println("Max element is : "+max);
	System.out.println("Min element is : "+min);
}
}
