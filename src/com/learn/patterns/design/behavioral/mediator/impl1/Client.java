package com.learn.patterns.design.behavioral.mediator.impl1;

public class Client {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		
		User user1 = new UserImpl(mediator, "Bob");
		User user2 = new UserImpl(mediator, "Freddy");
		User user3 = new UserImpl(mediator, "Jason");
		User user4 = new UserImpl(mediator, "The Rock");
		User user5 = new UserImpl(mediator, "Aung La");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		mediator.addUser(user5);
		
		user5.send("Hello Everybody!");
	}
}
