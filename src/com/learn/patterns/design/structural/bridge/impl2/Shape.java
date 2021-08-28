package com.learn.patterns.design.structural.bridge.impl2;

public abstract class Shape {

	protected DrawingApi api;
	
	public Shape(DrawingApi api) {
		this.api = api;
	}

	abstract void draw();
}
