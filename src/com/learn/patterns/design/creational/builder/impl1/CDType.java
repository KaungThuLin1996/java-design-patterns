package com.learn.patterns.design.creational.builder.impl1;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	
	private List<Packing> items = new ArrayList<>();
	
	public void addItem(Packing pack) {
		items.add(pack);
	}
	
	public void getCost() {
		for (Packing pack : items) {
			pack.price();
		}
	}
	
	public void showItems() {
		items.stream().forEach(a -> System.out.println("CD Name : " + a.pack() + ", Price : " + a.price()));
	}
}
