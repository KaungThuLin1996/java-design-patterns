package com.learn.patterns.design.structural.proxy.impl2;

public class Client {

	public static void main(String[] args) throws Exception {
		CommandExecutor executor = new CommandExecutorProxy("admin", "admin");
		executor.runCommand("notepad.exe");
		executor = new CommandExecutorProxy("user", "user");
		executor.runCommand("rm");
	}
}
