package com.learn.patterns.design.behavioral.chainofresponsibility.impl1;

public class Command {

	private int amount;

	public Command(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
