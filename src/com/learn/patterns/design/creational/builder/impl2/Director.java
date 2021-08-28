package com.learn.patterns.design.creational.builder.impl2;

public class Director {

	private BuilderInterface myBuilder;
	
	public void construct(BuilderInterface builder) {
		myBuilder = builder;
		myBuilder.buildBody();
		myBuilder.insertWheels();
		myBuilder.addHeadlights();
	}
}
