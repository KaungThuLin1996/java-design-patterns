package com.learn.patterns.design.creational.abstractfactory.impl1;

public interface Color {
	void fill();
}

class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Fill Red Color!");
	}
}

class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Fill Green Color!");
	}
}

class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Fill Blue Color!");
	}
}
