package com.learn.patterns.design.structural.adapter.impl2;

public class CalculatorAdaptor implements CalculatorInterface {

	private Calculator calculator;
	private Triangle t;
	
	public CalculatorAdaptor(Triangle t) {
		this.t = t;
	}

	@Override
	public double getArea(Rectangle rectangle) {
		calculator = new Calculator();
		Rectangle r = new Rectangle();
		r.length = t.base;
		r.width = 0.5 * t.height;
		return calculator.getArea(r);
	}
}
