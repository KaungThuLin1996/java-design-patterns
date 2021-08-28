package com.learn.patterns.design.behavioral.strategy.impl2;

public class PaypalStrategy implements PaymentStrategy {

	private String email_id;
	private String password;

	public PaypalStrategy(String email_id, String password) {
		super();
		this.email_id = email_id;
		this.password = password;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal");
	}

}
