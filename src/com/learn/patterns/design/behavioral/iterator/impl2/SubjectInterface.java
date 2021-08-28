package com.learn.patterns.design.behavioral.iterator.impl2;

import java.util.LinkedList;

public interface SubjectInterface {

	IteratorInterface createIteratorInterface();
}

class Art implements SubjectInterface {

	private String[] subjects;
	
	public Art() {
		subjects = new String[2];
		subjects[0] = "French";
		subjects[1] = "English";
	}
	
	@Override
	public IteratorInterface createIteratorInterface() {
		return new ArtIterator(subjects);
	}
}

class Science implements SubjectInterface {

	private LinkedList<String> subjects;
	
	public Science() {
		subjects = new LinkedList<>();
		subjects.add("Math");
		subjects.add("Chemistry");
		subjects.add("Nuclear");
	}
	
	@Override
	public IteratorInterface createIteratorInterface() {
		return new ScienceIterator(subjects);
	}
}
