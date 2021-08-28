package com.learn.patterns.design.behavioral.command.impl1;

public class Client {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Command copy = new CopyCommand();
		invoker.invoke(copy);
		Command edit = new EditCommand();
		invoker.invoke(edit);
		invoker.undo();
		invoker.undo();
	}
}
