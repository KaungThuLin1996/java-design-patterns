package com.learn.patterns.design.behavioral.command.impl1;

public class EditCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Edit Executed");
	}
}
