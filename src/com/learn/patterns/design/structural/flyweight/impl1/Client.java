package com.learn.patterns.design.structural.flyweight.impl1;

public class Client {

	public static void main(String[] args) {
		Code javaCode = new Code("Java Program");
		Platform java = PlatformFactory.getInstance("Java");
		java.execute(javaCode);
		Code dotNetCode = new Code("Dot Net Program");
		Platform dotNet = PlatformFactory.getInstance(".Net");
		dotNet.execute(dotNetCode);
	}
}
