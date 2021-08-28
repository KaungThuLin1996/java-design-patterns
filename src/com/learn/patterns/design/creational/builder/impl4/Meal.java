package com.learn.patterns.design.creational.builder.impl4;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items;
	
	public Meal() {
		items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public int getCost() {
		int cost = 0;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing());
			System.out.println(", Price : " + item.price());
		}
	}
}
