package com.learn.patterns.design.structural.adapter.impl2;

public class Client {

	public static void main(String[] args) {
		System.out.println("*** Adaptor Pattern Demo ");
		Triangle t = new Triangle(20, 10);
		CalculatorInterface adaptor = new CalculatorAdaptor(t);
		System.out.println("Area of Triangle is " + adaptor.getArea(null));
	}
}
