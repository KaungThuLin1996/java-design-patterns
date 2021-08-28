package com.learn.patterns.design.creational.factorymethod.impl5;

public class Client {
	
	public static void main(String[] args) {
		AnimalFactory factory = new AnimalFactory();
		factory.getAnimal("tiger").eat();
		factory.getAnimal("duck").eat();
	}
}
