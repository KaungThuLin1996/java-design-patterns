package com.learn.patterns.design.creational.builder.impl2;

import java.util.LinkedList;

public class Product {

	private LinkedList<String> parts;
	
	public Product() {
		parts = new LinkedList<>();
	}
	
	public void add(String part) {
		parts.addLast(part);
	}
	
	public void show() {
		System.out.println("Product completed as below");
		parts.stream().forEach(c -> System.out.println(c));
	}
}
