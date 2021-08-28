package com.learn.patterns.design.creational.factorymethod.impl4;

public class Client {

	public static void main(String[] args) {
		LoggerFactory factory = new ConsoleLoggerFactory();
		factory.getLogger().log("LOGGER");
		factory = new XmlLoggerFactory();
		factory.getLogger().log("XML");
	}
}
