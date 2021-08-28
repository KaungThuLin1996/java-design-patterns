package com.learn.patterns.design.structural.adapter.impl4;

public class Client {

	public static void main(String[] args) {
		// Class Adaptor
		Framework framework1 = new ClassAdaptor();
		framework1.add(55);
		
		// Object Adaptor
		Framework framework2 = new ObjectAdaptor(new OldApi());
		framework2.add(100);
	}
}
