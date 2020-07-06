package com.wipro.exceptionhandling;

import java.util.Scanner;

public class Exceptions1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array ");
	int num=sc.nextInt();
	int[] arr=new int[num];
	System.out.println("Enter the elements in the array ");
	for(int i=0;i<num;i++) {
		try
		{
			arr[i]=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("java.lang.NumberFormatException");
			return;
		}
	}
	System.out.println("Enter the index of the array element youwant to access ");
	
	int index=sc.nextInt();
	int s=0;
	try
	{
		s=arr[index];
	}
	catch(Exception e)
	{
		System.out.println("java.lang.ArrayOutOfBoundsException");
		return;
	}
	System.out.println("The array element at index "+index +" = "+s);
	System.out.println("The number is sucessfully accessed");
	

	
	sc.close();
}
}
