package com.wipro.arrays;

public class Ex_10arrays {
public static void main(String[] args) {
	int s=args.length;
	int i,k=0,j=0;
	int[] arr=new int[s];
	int[] b=new int[s];
	int[] c=new int[s];
	for( i=0;i<s;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;
		
	}
	for(i=0;i<s;i++) {
		if(arr[i]%2==0) {
			b[j++]=arr[i];
		}
		else {
			c[k++]=arr[i];
		}
	}
	System.out.print("[");
	for(i=0;i<j;i++) {
	System.out.print(b[i]+",");
	}
	for(i=0;i<k;i++) {
		if(i==k-1) {
		System.out.print(c[i]);
	}
		else {
			System.out.print(c[i]+",");
		}
}
	System.out.print("]");
}
}
