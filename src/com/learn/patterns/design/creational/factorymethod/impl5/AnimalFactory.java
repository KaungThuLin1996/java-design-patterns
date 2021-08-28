package com.learn.patterns.design.creational.factorymethod.impl5;

public class AnimalFactory {
	
	public Animal getAnimal(String animalType) {
		if (animalType == null) {
			return null;
		} else if (animalType.equalsIgnoreCase("duck")) {
			return new Duck();
		} else if (animalType.equalsIgnoreCase("Tiger")) {
			return new Tiger();
		}
		return null;
	}
}
