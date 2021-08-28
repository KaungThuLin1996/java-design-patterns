package com.learn.patterns.design.behavioral.interpreter.impl2;

public class Client {

	private static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("robert");
		Expression john = new TerminalExpression("john");
		return new OrExpression(robert, john);
	}
	
	private static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("julie");
		Expression married = new TerminalExpression("married");
		return new AndExpression(julie, married);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		Context ic1 = new Context("john");
		System.out.println("John is male? " + isMale.interpret(ic1));
		Context ic2 = new Context("married julie");
		System.out.println("Julie is married woman? " + isMarriedWoman.interpret(ic2));
		Context ic3 = new Context("lucy");
		System.out.println("Lucy is male? " + isMale.interpret(ic3));
	}
}
