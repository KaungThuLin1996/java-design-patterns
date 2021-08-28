package com.learn.patterns.design.behavioral.state.impl1;

public class Client {

	public static void main(String[] args) {
		Off initialState = new Off();
		TV tv = new TV(initialState);
		tv.pressButton();
		tv.pressButton();
	}
}
