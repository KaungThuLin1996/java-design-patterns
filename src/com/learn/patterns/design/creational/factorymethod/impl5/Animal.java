package com.learn.patterns.design.creational.factorymethod.impl5;

public interface Animal {
	void eat();
}

class Duck implements Animal {

	@Override
	public void eat() {
		System.out.println("Duck eats insect.");
	}
}

class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("Tiger eats meat.");
	}
}
