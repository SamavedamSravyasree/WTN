package com.wipro.arrays;

public class Ex_13arrays {
public static void main(String[] args) {
	int i,j;
	int arr[][]=new int[2][2];
	int s=args.length;
	  if(s<4) {
		System.out.println("Please enter 4 interger numbers ");
		
	}
	  else {
		  for(i=0;i<2;i++) {
			  for(j=0;j<2;j++) {
				  int a=Integer.parseInt(args[2*i+j]);
				  arr[i][j]=a;
				
			  }
		  }
		  System.out.println("The given array is : ");
		    for(i=0;i<2;i++)
		    {
		        for( j=0;j<2;j++)
		        {
		        System.out.print(arr[i][j]+" ");
		        }
		        System.out.println();
		        
		    }
		    System.out.println("The reverse of array is : ");
		    for(i=1;i>=0;i--)
		    {
		        for( j=1;j>=0;j--)
		        {
		        System.out.print(arr[i][j]+" ");
		        }
		        System.out.println();
		    }
	  }
	  
}
}
