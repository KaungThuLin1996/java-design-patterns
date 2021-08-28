package com.learn.patterns.design.behavioral.chainofresponsibility.impl1;

public class ManagerPurchasePower extends PurchasePower {

	static final int ALLOW = BASE * 10;
	
	@Override
	public void handleRequest(Command cmd) {
		if (cmd.getAmount() <= ALLOW) {
			System.out.println("Sale handled by Manager.");
		} else {
			if (this.getSuccessor() != null) {
				successor.handleRequest(cmd);
			}
		}
	}
}
