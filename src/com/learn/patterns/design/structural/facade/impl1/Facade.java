package com.learn.patterns.design.structural.facade.impl1;

public class Facade {
	
	private CPU cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	public Facade() {
		cpu = new CPU();
		memory = new Memory();
		hardDisk = new HardDisk();
	}

	public void start() {
		hardDisk.readBootSector();
		memory.load();
		cpu.jump();
		cpu.execute();
	}
}
