package com.learn.patterns.design.structural.proxy.impl2;

public class CommandExecutorProxy implements CommandExecutor {
	
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String username, String password) {
		if ("admin".equals(username) && "admin".equals(password)) {
			isAdmin = true;
		}
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users.");
			}
			executor.runCommand(cmd);
		}
	}
}
