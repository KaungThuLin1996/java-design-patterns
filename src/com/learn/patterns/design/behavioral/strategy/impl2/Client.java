package com.learn.patterns.design.behavioral.strategy.impl2;

public class Client {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Item("12345", 400));
		cart.addItem(new Item("34567", 500));
		cart.pay(new CreditCardStrategy("ktl", "00000", "789", "20/20"));
		cart.pay(new PaypalStrategy("ktl@gmail.com", "admin"));
	}
}
