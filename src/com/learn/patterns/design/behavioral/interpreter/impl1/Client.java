package com.learn.patterns.design.behavioral.interpreter.impl1;

public class Client {
	
	private InterpreterContext ic;
	
	public Client(InterpreterContext i) {
		ic = i;
	}
	
	public String interpret(String str) {
		Expression exp = null;
		if (str.contains("Hexadecimal")) {
			exp = new IntToHexadecimalExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if (str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else {
			return str; 
		}
		return exp.interpret(ic);
	}

	public static void main(String[] args) {
		String str1 = "28 in Hexadecimal";
		String str2 = "28 in Binary";
		Client ec = new Client(new InterpreterContext());
		System.out.println("str1 = " + ec.interpret(str1));
		System.out.println("str2 = " + ec.interpret(str2));
	}
}
