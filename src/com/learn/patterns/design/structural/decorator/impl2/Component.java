package com.learn.patterns.design.structural.decorator.impl2;

public abstract class Component {

	protected abstract void doJob();
}

class ConcreteComponent extends Component {

	@Override
	protected void doJob() {
		System.out.println("I am from a Concrete Component - I am closed for modification");
	}
}
