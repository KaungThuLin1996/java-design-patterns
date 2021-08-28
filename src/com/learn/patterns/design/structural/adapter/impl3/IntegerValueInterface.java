package com.learn.patterns.design.structural.adapter.impl3;

public interface IntegerValueInterface {

	int getInteger();
}

class IntegerValue implements IntegerValueInterface {

	@Override
	public int getInteger() {
		return 5;
	}
}

class ClassAdaptor extends IntegerValue implements IntegerValueInterface {

	@Override
	public int getInteger() {
		return 2 + super.getInteger();
	}
}

class ObjectAdaptor implements IntegerValueInterface {

	private IntegerValueInterface myInt;
	
	public ObjectAdaptor(IntegerValueInterface myInt) {
		this.myInt = myInt;
	}

	@Override
	public int getInteger() {
		return 2 + myInt.getInteger();
	}
}
