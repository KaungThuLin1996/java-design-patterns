package com.learn.patterns.design.behavioral.strategy.impl1;

public class Context {

	private CalculationStrategy strategy;

	public Context(CalculationStrategy strategy) {
		this.strategy = strategy;
	}
	
	public float executeStrategy(float num1, float num2) {
		return this.strategy.calculate(num1, num2);
	}
}
