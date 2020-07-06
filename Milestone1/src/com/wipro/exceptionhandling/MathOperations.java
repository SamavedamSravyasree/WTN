package com.wipro.exceptionhandling;

public class MathOperations {
public static void main(String[] args) {
	int[] arr=new int[5];
	int s=0;
	try
	{
	for(int i=0;i<5;i++) {
		
			arr[i]=Integer.parseInt(args[i]);
			s=s+arr[i];
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
			return;
			
		}
	double avg=s/arr.length;

	System.out.println("Sum"+" = "+s);
	System.out.println("Avg = "+avg);
	

	
}
}
