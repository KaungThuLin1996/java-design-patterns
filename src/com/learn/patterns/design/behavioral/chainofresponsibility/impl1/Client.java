package com.learn.patterns.design.behavioral.chainofresponsibility.impl1;

public class Client {

	public static void main(String[] args) {
		PurchasePower manager = new ManagerPurchasePower();
		PurchasePower director = new DirectorPurchasePower();
		PurchasePower vicePresident = new VicePresidentPurchasePower();
		manager.setSuccessor(director);
		director.setSuccessor(vicePresident);
		manager.handleRequest(new Command(100));
		manager.handleRequest(new Command(200));
		manager.handleRequest(new Command(300));
		manager.handleRequest(new Command(1020));
	}
}
