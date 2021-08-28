package com.learn.patterns.design.behavioral.strategy.impl1;

public class Subtraction implements CalculationStrategy {

	@Override
	public float calculate(float num1, float num2) {
		return num1 - num2;
	}
}
