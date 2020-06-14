package com.wipro.flow.control;

public class Percentageofinterest {
public static void main(String[] args) {
	String s=args[0];
	int a=Integer.parseInt(args[1]);
	if(s.equals("Female") && (a>=1 && a<=58) ) {
		System.out.println("Percentage of interest = 8.2%");
	}
	if(s.equals("Female") && (a>=59 && a<=100)) {
		System.out.println("Percentage of interest = 9.2%");
	}
    if(s.equals("Male") && (a>=1 && a<=58)) 
    {
	System.out.println("Percentage of interest = 8.4%");
}
      if(s.equals("Male") && (a>=59 && a<=100))
      {
	System.out.println("Percentage of interest = 10.5%");
    }
}
}
