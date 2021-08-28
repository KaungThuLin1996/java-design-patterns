package com.learn.patterns.design.structural.adapter.impl3;

public class Client {

	public static void main(String[] args) {
		System.out.println("*** Class and Object Adaptor Demo ***");
		IntegerValueInterface ca = new ClassAdaptor();
		System.out.println("Class adaptor is returning : " +ca.getInteger());
		
		IntegerValueInterface oa = new ObjectAdaptor(new IntegerValue());
		System.out.println("Object adaptor is returning : " + oa.getInteger());
	}
}
