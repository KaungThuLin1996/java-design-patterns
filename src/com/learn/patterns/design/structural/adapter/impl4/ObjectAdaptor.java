package com.learn.patterns.design.structural.adapter.impl4;

public class ObjectAdaptor implements Framework {

	private OldApi oldApi;
	
	public ObjectAdaptor(OldApi oldApi) {
		this.oldApi = oldApi;
	}

	@Override
	public void add(int item) {
		oldApi.addItem(item);
	}
}
