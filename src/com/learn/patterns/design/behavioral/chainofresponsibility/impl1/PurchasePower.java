package com.learn.patterns.design.behavioral.chainofresponsibility.impl1;

public abstract class PurchasePower {

	static final int BASE = 10;
	PurchasePower successor;
	
	public abstract void handleRequest(Command cmd);

	public PurchasePower getSuccessor() {
		return successor;
	}

	public void setSuccessor(PurchasePower successor) {
		this.successor = successor;
	}
}
