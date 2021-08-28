package com.learn.patterns.design.behavioral.template.impl1;

public class Client {

	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		houseType.buildHouse();
		System.out.println("*************");
		houseType = new GlassHouse();
		houseType.buildHouse();
	}
}
