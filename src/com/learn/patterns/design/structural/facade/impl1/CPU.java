package com.learn.patterns.design.structural.facade.impl1;

public class CPU {

	public void freeze() {
		System.out.println("CPU Freeze");
	}
	
	public void jump() {
		System.out.println("Jump to Instruction");
	}
	
	public void execute() {
		System.out.println("Executing...");
	}
}
