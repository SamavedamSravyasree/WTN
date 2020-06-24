package com.wipro.classesandobjects;


class Box{
	double width,height, depth;
	 Box(double width,double height,double depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	double Volume(){
		return width*height*depth;
	}
}
public class Ex1ClassesandObjects {
	public static void main(String[] args) {
		double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
		double c=Double.parseDouble(args[2]);
		System.out.println(a +" "+ b+ " "+c);
		Box o=new Box(a,b,c);
		
		System.out.println("The volume of Box is : "+  o.Volume() +" cubicmetre");
		  
	}
  
}
