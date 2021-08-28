package com.learn.patterns.design.creational.factorymethod.impl2;

public class Client {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape1 = factory.getShape("rectangle");
		shape1.draw();
		Shape shape2 = factory.getShape("circle");
		shape2.draw();
		Shape shape3 = factory.getShape("square");
		shape3.draw();
	}
}
