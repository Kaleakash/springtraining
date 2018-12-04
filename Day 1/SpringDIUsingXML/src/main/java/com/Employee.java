package com;

public class Employee {
private int id;
private String name;
private float salary;
private Address add;

	public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}

	public Employee() {
		super();
		//this.id = 100;
		this.name="Unknown";
		this.salary = 8000;
		System.out.println("Object created");
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Business method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}

	
	
	
}
