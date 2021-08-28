package com.learn.patterns.design.behavioral.strategy.impl3;

public class Context {

	private SortStrategy strategy;

	public SortStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void sort() {
		this.strategy.sort();
	}
}
