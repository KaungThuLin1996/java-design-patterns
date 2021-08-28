package com.learn.patterns.design.behavioral.state.impl2;

public class Client {

	public static void main(String[] args) {
		AlertStateContext context = new AlertStateContext();
		context.alert();
		context.alert();
		context.setCurrentState(new Silent());
		context.alert();
		context.alert();
		context.alert();
	}
}
