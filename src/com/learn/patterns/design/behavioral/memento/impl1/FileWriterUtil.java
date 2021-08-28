package com.learn.patterns.design.behavioral.memento.impl1;

public class FileWriterUtil {

	private String fileName;
	private StringBuilder content;
	
	public FileWriterUtil(String fileName) {
		this.fileName = fileName;
		this.content = new StringBuilder();
	}

	public void write(String str) {
		this.content.append(str);
	}
	
	public Memento save() {
		return new Memento(this.fileName, this.content);
	}
	
	public void undoToLastSave(Object obj) {
		Memento memento = (Memento) obj;
		this.fileName = memento.fileName;
		this.content = memento.content;
	}
	
	@Override
	public String toString() {
		return this.content.toString();
	}

	private class Memento {
		private String fileName;
		private StringBuilder content;
		
		public Memento(String fileName, StringBuilder content) {
			this.fileName = fileName;
			this.content = new StringBuilder(content);
		}
	}
}
