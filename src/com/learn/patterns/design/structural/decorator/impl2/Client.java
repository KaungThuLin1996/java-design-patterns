package com.learn.patterns.design.structural.decorator.impl2;

public class Client {

	public static void main(String[] args) {
		System.out.println("*** Decorator Pattern Demo ***");
		
		ConcreteComponent component = new ConcreteComponent();
		
		ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();
		cd_1.setComponent(component);
		cd_1.doJob();
		
		ConcreteDecoratorEx_2 cd_2 = new ConcreteDecoratorEx_2();
		cd_2.setComponent(cd_1);
		cd_2.doJob();
	}
}
