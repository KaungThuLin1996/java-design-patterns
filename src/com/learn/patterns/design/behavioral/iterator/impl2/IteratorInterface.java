package com.learn.patterns.design.behavioral.iterator.impl2;

import java.util.LinkedList;

public interface IteratorInterface {

	void first();
	String next();
	boolean isDone();
	String currentItem();
}

class ArtIterator implements IteratorInterface {

	private String[] subjects;
	private int position;
	
	public ArtIterator(String[] subjects) {
		this.subjects = subjects;
		position = 0;
	}
	
	@Override
	public void first() {
		position = 0;
	}

	@Override
	public String next() {
		return subjects[position++];
	}

	@Override
	public boolean isDone() {
		return position >= subjects.length;
	}

	@Override
	public String currentItem() {
		return subjects[position];
	}
}

class ScienceIterator implements IteratorInterface {

	private LinkedList<String> subjects;
	private int position;
	
	public ScienceIterator(LinkedList<String> subjects) {
		this.subjects = subjects;
		position = 0;
	}
	
	@Override
	public void first() {
		position = 0;
	}

	@Override
	public String next() {
		return subjects.get(position++);
	}

	@Override
	public boolean isDone() {
		return position >= subjects.size();
	}

	@Override
	public String currentItem() {
		return subjects.get(position);
	}
}
