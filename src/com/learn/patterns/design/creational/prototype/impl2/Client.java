package com.learn.patterns.design.creational.prototype.impl2;

public class Client {

	public static void main(String[] args) {
		HeavyObject firstObj = new HeavyObject();
		HeavyObject secondObj = firstObj.reproduce();
		HeavyObject thirdObj = secondObj.reproduce();
		System.out.println(firstObj);
		System.out.println(secondObj);
		System.out.println(thirdObj);
	}
}
