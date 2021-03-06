package com.learn.patterns.design.behavioral.iterator.impl1;

public class NotificationBar {

	private NotificationCollection notifications;

	public NotificationBar(NotificationCollection notifications) {
		this.notifications = notifications;
	}
	
	public void printNotifications() {
		Iterator iterator = notifications.createIterator();
		System.out.println("-------NOTIFICATION BAR-------");
		while(iterator.hasNext()) {
			Notification n = (Notification) iterator.next();
			System.out.println(n.getNotification());
		}
	}
}
