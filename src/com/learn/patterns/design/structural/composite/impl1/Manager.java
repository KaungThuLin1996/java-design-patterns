package com.learn.patterns.design.structural.composite.impl1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {

	private String name;
	private double salary;
	private List<Employee> empList = new ArrayList<>();
	
	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void addEmployee(Employee emp) {
		empList.add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		empList.remove(emp);
	}
	
	public Employee getEmployee(int i) {
		return empList.get(i);
	}
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("-------------------------");
		System.out.println("Name = " + getName());
		System.out.println("Salary = " + getSalary());
		System.out.println("-------------------------");
		Iterator<Employee> empIterator = empList.iterator();
		while (empIterator.hasNext()) {
			Employee emp = empIterator.next();
			emp.showEmployeeDetails();
		}
	}
}
