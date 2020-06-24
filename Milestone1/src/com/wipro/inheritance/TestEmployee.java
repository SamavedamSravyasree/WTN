package com.wipro.inheritance;

public class TestEmployee {
public static void main(String[] args) {
	Employee e=new Employee();
	System.out.println("EMPLOYEE DETAILS : ");
	e.setName("ABC");
	e.setAnnualSalary(2000050.0);
	e.setNationalinsurancenumber("1025040");
	e.setYear(2020);
	System.out.println("NAME : "+e.getName());
	System.out.println("ANNUAL SALARY : "+e.getAnnualSalary());
	System.out.println("NATIONAL INSURANCE NUMBER : "+e.getNationalinsurancenumber());
	System.out.println("YEAR : "+e.getYear());
}
}
