package com.learn.patterns.design.creational.builder.impl1;

public class Sony extends Company {

	@Override
	public String pack() {
		return "Sony CD";
	}
	
	@Override
	public int price() {
		return 30;
	}
}
