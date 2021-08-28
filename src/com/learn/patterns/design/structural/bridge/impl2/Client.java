package com.learn.patterns.design.structural.bridge.impl2;

public class Client {

	public static void main(String[] args) {
		DrawingApi api = new SvgApi();
		Shape shape = new Circle(api);
		shape.draw();
		
		api = new CanvasApi();
		shape = new Rectangle(api);
		shape.draw();
	}
}
