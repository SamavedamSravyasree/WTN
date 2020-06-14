package com.wipro.arrays;

import java.util.Arrays;

public class Ex_7arrays {
public static void main(String[] args) {
	
	int s=args.length;
	int i;
	int[] arr=new int[s];
	for( i=0;i<s;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;	
	}
	Arrays.parallelSort(arr);
	
	for(i=0;i<s;i++) {
		if(i==s-1) {
			break;
		}
		if(arr[i]==arr[i+1]) {
			arr[i]=-500;
		}
	}
	System.out.print("{");
	for(i=0;i<s-1;i++) {
		if(arr[i]==-500) {
			continue;
		}
		else {
			System.out.print(arr[i]+ ",");	
		}
	}
	System.out.print(arr[s-1]);
	
	System.out.println("}");
}
}
