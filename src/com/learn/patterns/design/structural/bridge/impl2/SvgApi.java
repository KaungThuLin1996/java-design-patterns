package com.learn.patterns.design.structural.bridge.impl2;

public class SvgApi implements DrawingApi {

	@Override
	public void drawCircle() {
		System.out.println("Draw Svg Circle");
	}

	@Override
	public void drawRectangle() {
		System.out.println("Draw Svg Rectangle");
	}
}
