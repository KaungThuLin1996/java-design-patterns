package com.learn.patterns.design.structural.decorator.impl4;

public class HtmlDecorator implements Logger {

	private Logger logger;
	
	public HtmlDecorator(Logger logger) {
		this.logger = logger;
	}
	
	@Override
	public String log(String msg) {
		return "<html>" + logger.log(msg) + "</html>";
	}
}
