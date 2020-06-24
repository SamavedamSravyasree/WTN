package com.wipro.abstraction;

public class MainAuthorbook {
public static void main(String[] args) {
	Book b=new Book("Believe in yourself");
	b.getA();
	System.out.println("BOOK NAME : "+b.getName2());
	System.out.println("PRICE : "+b.getPrice());
	System.out.println("QTYINSTOCK : "+b.getQtyInstock());
}
}
