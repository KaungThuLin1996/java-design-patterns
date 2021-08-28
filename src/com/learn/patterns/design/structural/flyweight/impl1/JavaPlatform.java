package com.learn.patterns.design.structural.flyweight.impl1;

public class JavaPlatform implements Platform {

	public JavaPlatform() {
		System.out.println("Create Java Platform");
	}
	
	@Override
	public void execute(Code code) {
		System.out.println("Execute " + code.getCode() + " On Java");
	}
}
