package com.learn.patterns.design.structural.adapter.impl1;

public class TurkeyAdaptor implements Duck {
	
	private Turkey turkey;	

	public TurkeyAdaptor(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i=0; i<5; i++) {
			turkey.fly();
		}
	}
}
