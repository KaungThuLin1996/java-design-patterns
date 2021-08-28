package com.learn.patterns.design.structural.composite.impl2;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends UIWidget {
	
	private List<UIWidget> children = new ArrayList<>();

	public ViewGroup(String id) {
		super(id);
	}
	
	public void add(UIWidget child) {
		children.add(child);
	}
	
	@Override
	void paint() {
		System.out.println("Paint " + id);
		for (UIWidget child : children) {
			child.paint();
		}
	}
}
