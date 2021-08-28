package com.learn.patterns.design.structural.bridge.impl1;

public abstract class Workshop {

	abstract void work();
}

class Produce extends Workshop {

	@Override
	void work() {
		System.out.println("Produced");
	}
}

class Assemble extends Workshop {

	@Override
	void work() {
		System.out.println("And Assembled");
	}
}
