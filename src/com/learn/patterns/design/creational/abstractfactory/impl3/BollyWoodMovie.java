package com.learn.patterns.design.creational.abstractfactory.impl3;

public interface BollyWoodMovie {

	String getMovieName();
}

class BollyWoodActionMovie implements BollyWoodMovie {

	@Override
	public String getMovieName() {
		return "Bang Bang";
	}
}

class BollyWoodSciFiMovie implements BollyWoodMovie {

	@Override
	public String getMovieName() {
		return "Ra-One";
	}
}

class BollyWoodSportMovie implements BollyWoodMovie {

	@Override
	public String getMovieName() {
		return "Sultan";
	}
}
