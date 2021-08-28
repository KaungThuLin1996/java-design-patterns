package com.learn.patterns.design.creational.abstractfactory.impl3;

public interface HollyWoodMovie {
	
	String getMovieName();
}

class HollyWoodActionMovie implements HollyWoodMovie {

	@Override
	public String getMovieName() {
		return "Blitz";
	}
}

class HollyWoodSciFiMovie implements HollyWoodMovie {

	@Override
	public String getMovieName() {
		return "12 Monkeys";
	}
}

class HollyWoodSportMovie implements HollyWoodMovie {

	@Override
	public String getMovieName() {
		return "Munic";
	}
}
