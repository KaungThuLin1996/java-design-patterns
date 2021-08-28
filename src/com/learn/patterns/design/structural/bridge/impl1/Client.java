package com.learn.patterns.design.structural.bridge.impl1;

public class Client {

	public static void main(String[] args) {
		Vehicle vehicle = new Car(new Produce(), new Assemble());
		vehicle.manufacture();
		System.out.println();
		vehicle = new Bike(new Produce(), new Assemble());
		vehicle.manufacture();
	}
}
