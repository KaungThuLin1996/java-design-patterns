package com.learn.patterns.design.creational.singleton.impl7;

public class MakeACaptain {
	
	private MakeACaptain() {
		
	}

	private static class SingletonHelper {
		private static final MakeACaptain _captain = new MakeACaptain();
	}
	
	public static MakeACaptain getInstance() {
		return SingletonHelper._captain;
	}
}
