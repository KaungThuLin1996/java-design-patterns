package com.learn.patterns.design.behavioral.strategy.impl3;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new BubbleSort());
		context.sort();
		context.setStrategy(new MergeSort());
		context.sort();
	}
}
