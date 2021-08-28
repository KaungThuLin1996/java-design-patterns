package com.learn.patterns.design.behavioral.observer.impl2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface Subject {

	void registerObserver(Observer o);
	void unregisterObserver(Observer o);
	void notifyObservers();
}

class CricketData implements Subject {
	
	private List<Observer> observerList;
	private int runs;
	private int wickets;
	private float overs;
	
	public CricketData() {
		observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		observerList.remove(observerList.indexOf(o));
	}

	@Override
	public void notifyObservers() {
		for (Iterator<Observer> it = observerList.iterator(); it.hasNext(); ) {
			Observer o = it.next();
			o.update(runs, wickets, overs);
		}
	}
	
	private int getLatestRuns() {
		return 90;
	}
	
	private int getLatestWickets() {
		return 2;
	}
	
	private float getLatestOvers() {
		return (float) 10.2;
	}
	
	public void dataChanged() {
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();
		notifyObservers();
	}
}
