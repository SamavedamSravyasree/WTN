package com.wipro.arrays;

public class Ex_12arrays {
public static void main(String[] args) {
	int[] arr=new int[3];
	int[] arr1=new int[3];
	int i;
	
	for( i=0;i<3;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;	
	}
	
	for(i=0;i<3;i++) {
		int b=Integer.parseInt(args[i+3]);
		arr1[i]=b;	
		
	}
	System.out.print("[");
	for(i=1;i<2;i++) {
		System.out.print(arr[1]+",");
		System.out.print(arr1[i]);
	}

	System.out.print("]");

}
}
