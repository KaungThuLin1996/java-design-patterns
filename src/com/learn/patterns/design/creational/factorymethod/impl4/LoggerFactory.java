package com.learn.patterns.design.creational.factorymethod.impl4;

public abstract class LoggerFactory {
	 abstract Logger getLogger();
}

class ConsoleLoggerFactory extends LoggerFactory {

	@Override
	Logger getLogger() {
		return new ConsoleLogger();
	}
}

class XmlLoggerFactory extends LoggerFactory {

	@Override
	Logger getLogger() {
		return new XmlLogger();
	}
}