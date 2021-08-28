package com.learn.patterns.design.creational.abstractfactory.impl3;

public class FactoryProducer {

	public static AbstractFactory getFactory(String movieType) {
		if (movieType == null) {
			return null;
		}
		if (movieType.equalsIgnoreCase("action")) {
			return new ActionMovieFactory();
		} else if (movieType.equalsIgnoreCase("scifi")) {
			return new SciFiMovieFactory();
		} else if (movieType.equalsIgnoreCase("sport")) {
			return new SportMovieFactory();
		}
		return null;
	}
}
