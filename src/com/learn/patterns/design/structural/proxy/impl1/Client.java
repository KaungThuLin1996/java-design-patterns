package com.learn.patterns.design.structural.proxy.impl1;

public class Client {

	public static void main(String[] args) {
		Image image = new ProxyImage("somefilename.jpg");
		image.display();
		System.out.println("");
		image.display();
	}
}
