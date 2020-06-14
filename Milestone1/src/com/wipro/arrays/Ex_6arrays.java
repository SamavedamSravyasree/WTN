package com.wipro.arrays;

import java.util.Arrays;

public class Ex_6arrays {
public static void main(String[] args) {
	int s=args.length;
	int i;
	int[] arr=new int[s];
	for( i=0;i<s;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;	
	}
	
	Arrays.parallelSort(arr);
	System.out.println("Sorted array is :"+ Arrays.toString(arr));
}
}
