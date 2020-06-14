package com.wipro.flow.control;

public class Ex_13 {
	public static void main(String[] args) {
		int f=0,i,j;
		for(i=10;i<=99;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					
					break;
				}
			}
			if(j==i) {
				System.out.print(i+" ");
			}
		}
	}

}
