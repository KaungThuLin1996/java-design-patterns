package com.learn.patterns.design.structural.composite.impl2;

public class Client {

	public static void main(String[] args) {
		ViewGroup viewGroup1 = new ViewGroup("parentGroup");
		View view1 = new View("view1");
		View view2 = new View("view2");
		viewGroup1.add(view1);
		viewGroup1.add(view2);
		
		ViewGroup viewGroup2 = new ViewGroup("childGroup");
		viewGroup2.add(new View("level2child"));
		viewGroup1.add(viewGroup2);
		viewGroup1.paint();
	}
}
