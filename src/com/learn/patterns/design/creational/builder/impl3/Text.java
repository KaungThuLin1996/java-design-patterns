package com.learn.patterns.design.creational.builder.impl3;

public class Text {
	
	private String displayValue;
	private String font;
	private String color;
	private String decoration;
	
	private Text(Builder builder) {
		this.displayValue = builder.displayValue;
		this.font = builder.font;
		this.color = builder.color;
		this.decoration = builder.decoration;
	}

	static class Builder {
		private String displayValue;
		private String font;
		private String color;
		private String decoration;
		
		Builder displayValue(String displayValue) {
			this.displayValue = displayValue;
			return this;
		}
		
		Builder font(String font) {
			this.font = font;
			return this;
		}
		
		Builder color(String color) {
			this.color = color;
			return this;
		}
		
		Builder decoration(String decoration) {
			this.decoration = decoration;
			return this;
		}
		
		Text build() {
			Text text = new Text(this);
			return text;
		}
	}

	@Override
	public String toString() {
		return "Text [displayValue=" + displayValue + ", font=" + font + ", color=" + color + ", decoration="
				+ decoration + "]";
	}
}
