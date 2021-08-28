package com.learn.patterns.design.creational.builder.impl4;

public interface Item {
	
	String name();
	Packing packing();
	int price();
}

abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract int price();
	
}

class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public int price() {
		return 1000;
	}
}

class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public int price() {
		return 2000;
	}
}

abstract class ColdDrink implements Item {
	
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract int price();
}

class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public int price() {
		return 500;
	}
}

class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public int price() {
		return 750;
	}
}

interface Packing {
	String pack();
}

class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}
}

class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}
}
