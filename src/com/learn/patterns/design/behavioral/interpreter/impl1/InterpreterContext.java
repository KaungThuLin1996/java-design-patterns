package com.learn.patterns.design.behavioral.interpreter.impl1;

public class InterpreterContext {

	public String getBinaryFormat(int i) {
		return Integer.toBinaryString(i);
	}
	
	public String getHexadecimalFormat(int i) {
		return Integer.toHexString(i);
	}
}
