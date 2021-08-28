package com.learn.patterns.design.creational.prototype.impl3;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("***Prototype Pattern Demo***\n");
		BasicCarCache.loadCache();
		BasicCar bc1 = (BasicCar) BasicCarCache.getCar("Green Nano");
		bc1.price = bc1.price + BasicCar.setPrice();
		System.out.println("Car is: " + bc1.getModelName() + " and it's price is Rs." + bc1.price);
		
		bc1 = (BasicCar) BasicCarCache.getCar("Ford Yellow");
		bc1.price = bc1.price + BasicCar.setPrice();
		System.out.println("Car is: " + bc1.getModelName() + " and it's price is Rs." + bc1.price);
	}
}
