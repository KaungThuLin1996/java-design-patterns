package com.learn.patterns.design.structural.adapter.impl1;

public class Client {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		Turkey turkey = new WildTurkey();
		
		System.out.println("The duck says...");
		duck.quack();
		duck.fly();
		
		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("The turkey says like duck...");
		TurkeyAdaptor adaptor = new TurkeyAdaptor(turkey);
		adaptor.quack();
		adaptor.fly();
	}
}
