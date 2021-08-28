package com.learn.patterns.design.creational.builder.impl4;

public class Director {

	MealBuilderInterface myBuilder;
	
	public void construct(MealBuilderInterface builder) {
		myBuilder = builder;
		myBuilder.buildBurger();
		myBuilder.buildDrink();
	}
}
