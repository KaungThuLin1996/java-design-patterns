package com.learn.patterns.design.creational.factorymethod.impl3;

public interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle!");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle!");
	}
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Square!");
	}
}
