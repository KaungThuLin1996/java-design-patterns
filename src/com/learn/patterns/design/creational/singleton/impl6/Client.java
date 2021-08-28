package com.learn.patterns.design.creational.singleton.impl6;

public class Client {

	public static void main(String[] args) {
		Logger logger1 = Logger.getLogger();
		Logger logger2 = Logger.getLogger();
		System.out.println(logger1);
		System.out.println(logger2);
		System.out.println(logger1 == logger2);
		logger1.log("I'm Logger One");
		logger2.log("I'm Logger Two");
	}
}
