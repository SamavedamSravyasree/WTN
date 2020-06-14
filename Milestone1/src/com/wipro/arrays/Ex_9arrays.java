package com.wipro.arrays;

public class Ex_9arrays {
	public static void main(String[] args) {
		
		int s=args.length;
		int c=0,i;
		int[] arr=new int[s];
		for( i=0;i<s;i++) {
			int a=Integer.parseInt(args[i]);
			arr[i]=a;
			
		}	
		System.out.print("[");
		for(i=0;i<s;i++) {
			if(arr[i]==10) {
				c++;
			}
			else {
				System.out.print(arr[i]+",");
			}
		}
		for(i=0;i<c;i++) {
			if(i==c-1) {
				System.out.print("0");
			}
			else {
			System.out.print("0"+",");
		}
		}
		System.out.print("]");
		
		
		
		
		
		
	}
}
