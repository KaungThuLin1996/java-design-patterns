package com.learn.patterns.design.structural.composite.impl2;

public abstract class UIWidget {

	protected String id;
	
	protected UIWidget(String id) {
		this.id = id;
	}
	
	abstract void paint();
}
