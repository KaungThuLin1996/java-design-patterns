package com.learn.patterns.design.structural.composite.impl2;

public class View extends UIWidget {

	public View(String id) {
		super(id);
	}

	@Override
	void paint() {
		System.out.println("Paint " + id);
	}
}
