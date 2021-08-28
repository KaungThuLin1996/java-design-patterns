package com.learn.patterns.design.structural.bridge.impl2;

public class Circle extends Shape {

	public Circle(DrawingApi api) {
		super(api);
	}

	@Override
	void draw() {
		api.drawCircle();
	}
}
