package com.learn.patterns.design.creational.factorymethod.impl4;

public interface Logger {
	void log(String message);
}

class ConsoleLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Logging in Console this message: " + message);
	}
}

class XmlLogger implements Logger {
	
	@Override
	public void log(String messsage) {
		System.out.println("Logging in Xml this message: " + messsage);
	}
}
