package com.learn.patterns.design.behavioral.mediator.impl1;

import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {

	void addUser(User user);
	void sendMessage(String msg, User user);
}

class ChatMediatorImpl implements ChatMediator {
	
	private List<User> userList;
	
	public ChatMediatorImpl() {
		userList = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		userList.add(user);
	}
	
	@Override
	public void sendMessage(String msg, User user) {
		userList.stream().filter(u -> u != user).forEach(u -> u.receive(msg));
	}
}
