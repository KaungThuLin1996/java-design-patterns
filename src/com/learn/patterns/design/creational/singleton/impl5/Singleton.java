package com.learn.patterns.design.creational.singleton.impl5;

public class Singleton {
	
	private int data = 0;

	private Singleton() {
		
	}

	private static class SingletonHelper {
		private static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHelper.instance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
