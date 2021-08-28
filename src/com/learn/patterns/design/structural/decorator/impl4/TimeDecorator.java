package com.learn.patterns.design.structural.decorator.impl4;

import java.time.LocalDate;

public class TimeDecorator implements Logger {

	private Logger logger;
	
	public TimeDecorator(Logger logger) {
		this.logger = logger;
	}
	
	@Override
	public String log(String msg) {
		return LocalDate.now() + " " + logger.log(msg);
	}
}
