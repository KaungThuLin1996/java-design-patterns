package com.learn.patterns.design.behavioral.command.impl1;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List<Command> history = new ArrayList<>();
	
	public void invoke(Command cmd) {
		history.add(cmd);
		cmd.execute();
	}
	
	public void undo() {
		int len = history.size() - 1;
		Command cmd = history.get(len);
		history.remove(len);
		System.out.println("Undo");
		cmd.execute();
	}
}
