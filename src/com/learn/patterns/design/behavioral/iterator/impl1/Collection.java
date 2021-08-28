package com.learn.patterns.design.behavioral.iterator.impl1;

public interface Collection {

	Iterator createIterator();
}

class NotificationCollection implements Collection {

	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	private Notification[] notificationList;
	
	public NotificationCollection() {
		notificationList = new Notification[MAX_ITEMS];
		addItem("Notification 1");
		addItem("Notification 2");
		addItem("Notification 3");
		addItem("Notification 4");
		addItem("Notification 5");
		addItem("Notification 6");
	}

	private void addItem(String str) {
		Notification notification = new Notification(str);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Full");
		} else {
			notificationList[numberOfItems] = notification;
			numberOfItems += 1;
		}
	}

	@Override
	public Iterator createIterator() {
		return new NotificationIterator(notificationList);
	}
}
