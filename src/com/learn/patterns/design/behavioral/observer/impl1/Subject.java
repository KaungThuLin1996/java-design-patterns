package com.learn.patterns.design.behavioral.observer.impl1;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

	void register(Observer obj);
	void unregister(Observer obj);
	void notifyObservers();
	Object getUpdate(Observer obj);
}

class MyTopic implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean changed;

	public MyTopic() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer obj) {
		if (obj == null) throw new NullPointerException("Null Observer");
		if (!observers.contains(obj)) observers.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		if (!changed) return;
		observersLocal = new ArrayList<>(this.observers);
		this.changed = false;
		observersLocal.stream().forEach(obj -> obj.update());
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic:" + msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}
}
