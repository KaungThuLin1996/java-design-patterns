package com.learn.patterns.design.structural.composite.impl1;

public class Client {

	public static void main(String[] args) {
		Employee dev1 = new Developer(1, "Peter", "Senior Developer");
		Employee dev2 = new Developer(2, "Harry", "Junior Developer");
		
		Manager engManager = new Manager("Mike", 25000);
		engManager.addEmployee(dev1);
		engManager.addEmployee(dev2);
		
		Employee dev3 = new Developer(3, "Osborn", "Professional Developer");
		
		Manager genManager = new Manager("Mark", 50000);
		genManager.addEmployee(dev3);
		genManager.addEmployee(engManager);
		genManager.showEmployeeDetails();
	}
}
