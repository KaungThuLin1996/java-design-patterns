package com.learn.patterns.design.behavioral.iterator.impl1;

public interface Iterator {

	boolean hasNext();
	Object next();
}

class NotificationIterator implements Iterator {
	
	private Notification[] notificationList;
	private int pos = 0;
	
	public NotificationIterator(Notification[] notifications) {
		this.notificationList = notifications;
	}

	@Override
	public boolean hasNext() {
		if (pos >= notificationList.length || notificationList[pos] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		Notification notification = notificationList[pos];
		pos += 1;
		return notification;
	}
}
