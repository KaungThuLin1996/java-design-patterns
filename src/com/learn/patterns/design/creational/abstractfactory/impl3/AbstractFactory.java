package com.learn.patterns.design.creational.abstractfactory.impl3;

public abstract class AbstractFactory {

	abstract HollyWoodMovie getHollyWoodMovie();
	abstract BollyWoodMovie getBollyWoodMovie();
}

class ActionMovieFactory extends AbstractFactory {

	@Override
	HollyWoodMovie getHollyWoodMovie() {
		return new HollyWoodActionMovie();
	}

	@Override
	BollyWoodMovie getBollyWoodMovie() {
		return new BollyWoodActionMovie();
	}
}

class SciFiMovieFactory extends AbstractFactory {

	@Override
	HollyWoodMovie getHollyWoodMovie() {
		return new HollyWoodSciFiMovie();
	}

	@Override
	BollyWoodMovie getBollyWoodMovie() {
		return new BollyWoodSciFiMovie();
	}
}

class SportMovieFactory extends AbstractFactory {

	@Override
	HollyWoodMovie getHollyWoodMovie() {
		return new HollyWoodSportMovie();
	}

	@Override
	BollyWoodMovie getBollyWoodMovie() {
		return new BollyWoodSportMovie();
	}
}
