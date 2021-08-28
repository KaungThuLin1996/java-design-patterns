package com.learn.patterns.design.behavioral.memento.impl2;

public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
