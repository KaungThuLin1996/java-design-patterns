package com.learn.patterns.design.creational.abstractfactory.impl1;

public class Client {
	
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
		Color color1 = colorFactory.getColor("Green");
		color1.fill();
		Color color2 = colorFactory.getColor("Blue");
		color2.fill();
		Color color3 = colorFactory.getColor("Red");
		color3.fill();
	}
}
