package com.learn.patterns.design.structural.decorator.impl2;

public abstract class AbstractDecorator extends Component {

	private Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	protected void doJob() {
		if (component != null)
			component.doJob();
	}
}

class ConcreteDecoratorEx_1 extends AbstractDecorator {

	@Override
	public void doJob() {
		super.doJob();
		System.out.println("I am explicitly from Ex_1");
	}
}

class ConcreteDecoratorEx_2 extends AbstractDecorator {

	@Override
	protected void doJob() {
		System.out.println("*** START Ex_2 ***");
		super.doJob();
		System.out.println("Explicitly From DecoratorEx_2");
		System.out.println("*** END Ex_2 ***");
	}
}
