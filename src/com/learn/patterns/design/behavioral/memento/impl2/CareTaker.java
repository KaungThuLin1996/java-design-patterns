package com.learn.patterns.design.behavioral.memento.impl2;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> mementoList;
	
	public CareTaker() {
		mementoList = new ArrayList<>();
	}
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
