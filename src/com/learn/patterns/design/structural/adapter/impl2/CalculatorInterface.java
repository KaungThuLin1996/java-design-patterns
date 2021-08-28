package com.learn.patterns.design.structural.adapter.impl2;

public interface CalculatorInterface {

	double getArea(Rectangle rectangle);
}

class Calculator implements CalculatorInterface {

	@Override
	public double getArea(Rectangle rectangle) {
		return rectangle.length * rectangle.width;
	}
}
