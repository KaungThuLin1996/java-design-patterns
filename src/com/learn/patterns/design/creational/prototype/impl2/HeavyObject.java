package com.learn.patterns.design.creational.prototype.impl2;

public class HeavyObject implements Prototype {
	
	private String propertyGetFromDB;
	private String computationalHungryProperty;
	
	static String getPropertyFromDB() {
		return "PropertyFromDb"; // Here assume call to db to simulate costly memory
	}
	
	static String getComputationalHungryProperty() {
		return "ComputationalHungryProperty"; // Here assume call to costly computation time
	}
	
	public HeavyObject() {
		propertyGetFromDB = HeavyObject.getPropertyFromDB();
		computationalHungryProperty = HeavyObject.getComputationalHungryProperty();
	}

	@Override
	public HeavyObject reproduce() {
		try {
			Prototype copy =(Prototype) super.clone();
			HeavyObject newObject = (HeavyObject) copy;
			return newObject;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "HeavyObject [propertyGetFromDB=" + propertyGetFromDB + ", computationalHungryProperty="
				+ computationalHungryProperty + "]";
	}
}
