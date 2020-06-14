package com.wipro.arrays;

public class Ex_5arrays {
public static void main(String[] args) {
	int s=args.length;
	int i;
	int[] arr=new int[s];
	for( i=0;i<s;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;	
	}
	int max1=arr[0],max2=arr[1];
	int min1=arr[0],min2=arr[1];
	int t;
	
	if(max2>max1) {
		t=max1;
		max1=max2;
		max2=t;
	}
	if(min1>min2) {
		t=min1;
		min1=min2;
		min2=t;
	}
	for(i=2;i<s;i++) {
		if(arr[i]>max1) {
			max2=max1;
			max1=arr[i];
		}
		if(arr[i]>max2 && arr[i]<max1) {
			max2=arr[i];
		}
		if(arr[i]<min1) {
			min2=min1;
			min1=arr[i];
		}
		if(arr[i]<min2 && arr[i]>min1) {
			min2=arr[i];
		}
	}
	System.out.println("Largest two numbers: "+max1+" "+max2);
	System.out.println("Smallest two numbers: "+min1+" "+min2);
}
}
