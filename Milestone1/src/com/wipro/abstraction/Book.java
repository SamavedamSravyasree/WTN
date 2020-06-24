package com.wipro.abstraction;

public class Book {
private String name2;
private double price=100;
private int qtyInstock=30;
private Author a=new Author("ABC","abc@gmail",'F');
Book(String name2)
{
	this.name2=name2;
	
}
public void getA() {
	System.out.println("NAME : "+a.getName());
	System.out.println("EMAIL : "+a.getEmail());
	System.out.println("GENDER : "+a.getGender());
}
public String getName2() {
	return name2;
}

public double getPrice() {
	return price;
}

public int getQtyInstock() {
	return qtyInstock;
}	
}
