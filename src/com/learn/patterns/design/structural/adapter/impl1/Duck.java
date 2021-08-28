package com.learn.patterns.design.structural.adapter.impl1;

public interface Duck {

	void quack();
	void fly();
}

class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}