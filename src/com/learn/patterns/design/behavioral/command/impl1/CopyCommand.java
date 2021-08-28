package com.learn.patterns.design.behavioral.command.impl1;

public class CopyCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Copy Executed");
	}
}
