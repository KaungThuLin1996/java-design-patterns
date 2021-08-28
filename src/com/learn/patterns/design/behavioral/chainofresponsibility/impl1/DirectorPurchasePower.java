package com.learn.patterns.design.behavioral.chainofresponsibility.impl1;

public class DirectorPurchasePower extends PurchasePower {

	static final int ALLOW = BASE * 20;
	
	@Override
	public void handleRequest(Command cmd) {
		if (cmd.getAmount() <= ALLOW) {
			System.out.println("Sale handled by Director.");
		} else {
			if (this.getSuccessor() != null) {
				successor.handleRequest(cmd);
			}
		}
	}
}
