package com.learn.patterns.design.behavioral.observer.impl2;

public interface Observer {

	void update(int runs, int wickets, float overs);
}

class AverageScoreDisplay implements Observer {
	
	private float runRate;
	private int predictedScore;

	@Override
	public void update(int runs, int wickets, float overs) {
		runRate = (float) runs/overs;
		predictedScore = (int) runRate * 50;
		display();
	}
	
	private void display() {
		System.out.println("\nAverage Score Display: \nRun Rate: " + runRate 
				+ "\nPredicted Score: " + predictedScore);
	}
}

class CurrentScoreDisplay implements Observer {
	
	private int runs, wickets;
	private float overs;

	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}
	
	private void display() {
		System.out.println("\nCurrent Score Display: \nRuns: " + runs 
				+ "\nWickets: " + wickets + "\nOvers: " + overs);
	}
}
