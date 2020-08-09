package com.wipro.wrapperclasses;


class Employee implements Cloneable {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}

public class Ex4WrapperClass {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Classes");
		Employee emp2 = emp1.clone();
		
		emp2.setName("Wrapper");
		
		System.out.println(emp2.getName());
		System.out.println(emp1.getName());
	}

}
