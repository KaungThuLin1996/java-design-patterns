package com.learn.patterns.design.structural.bridge.impl3;

public abstract class Shape {

	protected ColorInterface color;
	
	protected Shape(ColorInterface c) {
		this.color = c;
	}
	
	abstract void drawShape(int border);
	abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape {

	protected Triangle(ColorInterface c) {
		super(c);
	}

	@Override
	void drawShape(int border) {
		System.out.print("This Triangle is colored with ");
		color.fillWithColor(border);
	}

	@Override
	void modifyBorder(int border, int increment) {
		System.out.println("\nNow we are changing the border length " + increment + " times");
		border *= increment;
		drawShape(border);
	}
}

class Rectangle extends Shape {

	protected Rectangle(ColorInterface c) {
		super(c);
	}

	@Override
	void drawShape(int border) {
		System.out.print("This Rectangle is colored with ");
		color.fillWithColor(border);
	}

	@Override
	void modifyBorder(int border, int increment) {
		System.out.println("\nNow we are changing the border length " + increment + " times");
		border *= increment;
		drawShape(border);
	}
}
