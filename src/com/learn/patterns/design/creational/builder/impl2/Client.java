package com.learn.patterns.design.creational.builder.impl2;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		
		BuilderInterface carBuilder = new Car();
		BuilderInterface motorCycleBuilder = new MotorCycle();
		
		// making a car
		director.construct(carBuilder);
		Product p1 = carBuilder.getVehicle();
		p1.show();
		System.out.println();
		// making a motor cycle
		director.construct(motorCycleBuilder);
		Product p2 = motorCycleBuilder.getVehicle();
		p2.show();
	}
}
