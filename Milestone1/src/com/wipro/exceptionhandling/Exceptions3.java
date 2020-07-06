package com.wipro.exceptionhandling;

import java.util.Scanner;

class ValuesOutOfRangeException extends Exception
{
	public ValuesOutOfRangeException()
	{
		System.out.print("");
		return;
	}
}
class A
{
	public void OutofRange(int x) throws ValuesOutOfRangeException
	{
		if(x<0 || x>100)
		{
			throw new ValuesOutOfRangeException();
		}
	}
}
public class Exceptions3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String sn1,sn2;
		int []s1=new int[3];
		int []s2=new int[3];
		System.out.print("Enter Student1 Name : ");
		sn1=sc.next();
		System.out.println("Enter Student1 Marks : ");
		int i,su1=0,su2=0;
		A a=new A();
		for(i=0;i<3;i++)
		{
			try
			{
				s1[i]=sc.nextInt();
				a.OutofRange(s1[i]);
				su1+=s1[i];
			}
			catch(Exception e)
			{
				System.out.println(e);
				return;
			}
		}
		System.out.print("Enter Student2 Name : ");
		sn2=sc.next();
		System.out.println("Enter Student2 Marks : ");
		for(i=0;i<3;i++)
		{
			try
			{
				s2[i]=sc.nextInt();
				a.OutofRange(s2[i]);
				su2+=s2[i];
			}
			catch(Exception e)
			{
				System.out.println(e);
				return;
			}
		}
		sc.close();
		double avg1,avg2;
		avg1=((double)su1/3);
		avg2=((double)su2/3);
		System.out.println("Sum1 : "+su1+"\nAverage1 : "+avg1+"\n"
				+"Sum2 : "+su2+"\nAverage2 : "+avg2);
		
	}

}