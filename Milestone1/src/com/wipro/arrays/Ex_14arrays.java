package com.wipro.arrays;

public class Ex_14arrays {
public static void main(String[] args) {
	int i,j;
	int arr[][]=new int[3][3];
	int s=args.length;
	  if(s<9) {
		System.out.println("Please enter 9 interger numbers");
		
	}
	  else {
		  for(i=0;i<3;i++){
	            for(j=0;j<3;j++){
	            	int a=Integer.parseInt(args[3*i+j]);
	            	arr[i][j] = a;
	            	
	          }
	        }
	  
	int  max=arr[0][0];
  for(i=0;i<3;i++) {
	  for(j=0;j<3;j++) {
		  if(arr[i][j]>max) {
			  max=arr[i][j];
		  }
	  }
  }
  System.out.println("The given array is :");
  for(i=0;i<3;i++){
      for(j=0;j<3;j++){
      	System.out.print(arr[i][j]+" ");
    }
      System.out.println();
  }
  System.out.println("The biggest element in the given array is "+ max);
	  }
}
}
