package com.learn.patterns.design.structural.decorator.impl4;

public class Client {

	public static void main(String[] args) {
		Logger logger = new HtmlDecorator(new TimeDecorator(new BasicLogger()));
		String msg = logger.log("Log String");
		System.out.println(msg);
	}
}
