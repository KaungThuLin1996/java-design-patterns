package com.learn.patterns.design.behavioral.memento.impl1;

public class FileWriterCareTaker {

	private Object obj;
	
	public void save(FileWriterUtil fileWriter) {
		this.obj = fileWriter.save();
	}
	
	public void undo(FileWriterUtil fileWriter) {
		fileWriter.undoToLastSave(this.obj);
	}
}
