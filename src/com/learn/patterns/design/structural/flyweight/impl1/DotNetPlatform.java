package com.learn.patterns.design.structural.flyweight.impl1;

public class DotNetPlatform implements Platform {

	public DotNetPlatform() {
		System.out.println("Create Dot Net Platform");
	}
	
	@Override
	public void execute(Code code) {
		System.out.println("Execute " + code.getCode() + " On Dot Net Platform");
	}
}
