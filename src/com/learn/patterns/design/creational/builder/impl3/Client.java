package com.learn.patterns.design.creational.builder.impl3;

public class Client {

	public static void main(String[] args) {
		Text text = new Text.Builder().color("Yellow").decoration("Italic").displayValue("Hello").font("Times New Roman").build();
		System.out.println(text);
	}
}
