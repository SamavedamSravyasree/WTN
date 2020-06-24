package com.wipro.abstractclasses;
import java.util.Random;
abstract class Compartment{
	public abstract String notice() ;
	
}
class FirstClass extends Compartment{
	@Override
	public String notice() {
		System.out.println("FIRST CLASS COMPARTMENT");
		return null;
	}	
}
class Ladies extends Compartment{
	@Override
	public String notice() {
		System.out.println("LADIES COMPARTMENT");
		return null;
	}	
}
class General extends Compartment{
	@Override
	public String notice() {
		System.out.println("GENERAL COMPARTMENT");
		return null;
	}	
}
class Luggage extends Compartment{
	@Override
	public String notice() {
		System.out.println("LUGGAGE COMPARTMENT");
		return null;
	}
	
}
public class TestCompartment {
public static void main(String[] args) {
	int []a=new int[5];
	Compartment []c=new Compartment[10];
	Random rand = new Random(); 
	for(int i=0;i<10;i++) {
	int rand_r=rand.nextInt(4)+1;
	if(rand_r==1) {
		c[i] =new FirstClass();
		c[i].notice();
	}
	if(rand_r==2) {
		c[i]=new Ladies();
		c[i].notice();
	}
	if(rand_r==3) {
		c[i] =new General();
		c[i].notice();
	}
	if(rand_r==4) {
		c[i]=new Luggage();
		c[i].notice();
	}
	}
	
	
	
	
	
}
}
