package com.learn.patterns.design.creational.singleton.impl4;

public class Singleton {

	private static Singleton instance = new Singleton();
	private int data = 0;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
