package com.learn.patterns.design.structural.adapter.impl4;

public class ClassAdaptor extends OldApi implements Framework {

	@Override
	public void add(int item) {
		addItem(item);
	}
}
