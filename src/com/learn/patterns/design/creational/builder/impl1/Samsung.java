package com.learn.patterns.design.creational.builder.impl1;

public class Samsung extends Company {

	@Override
	public String pack() {
		return "Samsung CD";
	}
	
	@Override
	public int price() {
		return 25;
	}
}
