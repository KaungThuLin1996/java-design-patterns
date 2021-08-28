package com.learn.patterns.design.creational.singleton.impl1;

public class Singleton {
	
	private static Singleton instance = null;
	private int data = 0;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
