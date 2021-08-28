package com.learn.patterns.design.behavioral.state.impl2;

public class AlertStateContext {

	private MobileAlertState currentState;

	public AlertStateContext() {
		currentState = new Vibration();
	}

	public MobileAlertState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(MobileAlertState currentState) {
		this.currentState = currentState;
	}
	
	public void alert() {
		currentState.alert();
	}
}
