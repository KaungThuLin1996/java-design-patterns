package com.learn.patterns.design.behavioral.state.impl2;

public interface MobileAlertState {

	void alert();
}

class Vibration implements MobileAlertState {

	@Override
	public void alert() {
		System.out.println("Vibrating...");
	}
}

class Silent implements MobileAlertState {

	@Override
	public void alert() {
		System.out.println("Silent...");
	}
}
