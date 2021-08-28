package com.learn.patterns.design.behavioral.chainofresponsibility.impl1;

public class VicePresidentPurchasePower extends PurchasePower {

	static final int ALLOW = BASE * 30;
	
	@Override
	public void handleRequest(Command cmd) {
		if (cmd.getAmount() <= ALLOW) {
			System.out.println("Sale handled by Vice President");
		} else {
			if (this.getSuccessor() != null) {
				successor.handleRequest(cmd);
			}
		}
	}
}
