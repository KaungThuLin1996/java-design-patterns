package com.learn.patterns.design.creational.abstractfactory.impl3;

public class Client {

	public static void main(String[] args) {
		AbstractFactory actionFac = FactoryProducer.getFactory("action");
		HollyWoodMovie hMovie = actionFac.getHollyWoodMovie();
		BollyWoodMovie bMovie = actionFac.getBollyWoodMovie();
		System.out.print(String.format("Action Movies : %s, %s\n", hMovie.getMovieName(), bMovie.getMovieName()));
		AbstractFactory scifiFac = FactoryProducer.getFactory("scifi");
		hMovie = scifiFac.getHollyWoodMovie();
		bMovie = scifiFac.getBollyWoodMovie();
		System.out.print(String.format("Sci-Fi Movies : %s, %s\n", hMovie.getMovieName(), bMovie.getMovieName()));
		AbstractFactory sportFac = FactoryProducer.getFactory("sport");
		hMovie = sportFac.getHollyWoodMovie();
		bMovie = sportFac.getBollyWoodMovie();
		System.out.print(String.format("Sport Movies : %s, %s\n", hMovie.getMovieName(), bMovie.getMovieName()));
	}
}
