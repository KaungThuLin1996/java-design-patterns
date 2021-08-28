package com.learn.patterns.design.creational.singleton.impl7;

public class Client {

	public static void main(String[] args) {
		MakeACaptain cap1 = MakeACaptain.getInstance();
		MakeACaptain cap2 = MakeACaptain.getInstance();
		System.out.println(cap1 == cap2);
	}
}
