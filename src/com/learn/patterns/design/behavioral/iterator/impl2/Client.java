package com.learn.patterns.design.behavioral.iterator.impl2;

public class Client {
	
	private static void print(IteratorInterface iterator) {
		while (!iterator.isDone()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		System.out.println("*****Iterator Pattern Demo*****");
		SubjectInterface sc_subject = new Science();
		SubjectInterface ar_subject = new Art();
		
		IteratorInterface sc_iterator = sc_subject.createIteratorInterface();
		IteratorInterface ar_iterator = ar_subject.createIteratorInterface();
		
		System.out.println("\nScience Subjects : ");
		print(sc_iterator);
		
		System.out.println("\nArt Subjects : ");
		print(ar_iterator);
	}
}
