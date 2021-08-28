package com.learn.patterns.design.structural.decorator.impl1;

public interface Food {

	String prepareFood();
	double foodPrice();
}

class VegFood implements Food {

	@Override
	public String prepareFood() {
		return "Veg Food";
	}

	@Override
	public double foodPrice() {
		return 50.0;
	}
}
