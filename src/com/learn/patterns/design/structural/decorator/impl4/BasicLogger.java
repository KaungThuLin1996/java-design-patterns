package com.learn.patterns.design.structural.decorator.impl4;

public class BasicLogger implements Logger {

	@Override
	public String log(String msg) {
		return msg;
	}
}
