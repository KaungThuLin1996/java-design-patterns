package com.learn.patterns.design.structural.bridge.impl2;

public class Rectangle extends Shape {
	
	public Rectangle(DrawingApi api) {
		super(api);
	}
	
	@Override
	void draw() {
		api.drawRectangle();
	}
}
