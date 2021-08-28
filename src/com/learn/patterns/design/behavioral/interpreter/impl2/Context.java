package com.learn.patterns.design.behavioral.interpreter.impl2;

public class Context {

	private String input;
	
	public Context(String input) {
		this.input = input;
	}
	
	public boolean getResult(String data) {
		return input.contains(data);
	}
}
