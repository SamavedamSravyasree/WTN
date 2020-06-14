package com.wipro.arrays;

public class Ex_8arrays {
public static void main(String[] args) {
	int s=args.length;
	int t=0,p=0,sum=0,i;
	int[] arr=new int[s];
	for( i=0;i<s;i++) {
		int a=Integer.parseInt(args[i]);
		arr[i]=a;
	}
	for( i=0;i<s;i++) {
		if(arr[i]==6) {
			t=i;
		}
		if(arr[i]==7) {
			p=i;
		}	
		
	}
	if(t<p) {
		for(i=0;i<s;i++) {
			if(i>=t && i<=p) {
				continue;
			}
			else {
				sum=sum+arr[i];
				
			}
		}
	}
	else {
		for(i=0;i<s;i++) {
			sum=sum+arr[i];
		}
	}
		System.out.print(sum);
}
}
