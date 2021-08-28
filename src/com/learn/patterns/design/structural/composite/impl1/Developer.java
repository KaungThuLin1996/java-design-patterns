package com.learn.patterns.design.structural.composite.impl1;

public class Developer implements Employee {
	
	private int empId;
	private String name;
	private String position;

	public Developer(int empId, String name, String position) {
		this.empId = empId;
		this.name = name;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(empId + ", " + name + ", " + position);
	}
}
