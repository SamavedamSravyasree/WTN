package com.wipro.inheritance;

public class Employee extends Person {
private double annualSalary;
private int year;
private String nationalinsurancenumber;
public double getAnnualSalary() {
	return annualSalary;
}
public void setAnnualSalary(double annualSalary) {
	this.annualSalary = annualSalary;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getNationalinsurancenumber() {
	return nationalinsurancenumber;
}
public void setNationalinsurancenumber(String nationalinsurancenumber) {
	this.nationalinsurancenumber = nationalinsurancenumber;
}


}
