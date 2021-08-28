package com.learn.patterns.design.structural.adapter.impl5;

public interface AdvancedMediaPlayer {

	void loadFileName(String fileName);
	void listen();
}

class VlcPlayer implements AdvancedMediaPlayer {
	
	private String myFile;

	@Override
	public void loadFileName(String fileName) {
		myFile = fileName;
	}

	@Override
	public void listen() {
		System.out.println("Playing vlc file. Name: " + myFile);
	}
}

class Mp4Player implements AdvancedMediaPlayer {
	
	private String myFile;

	@Override
	public void loadFileName(String fileName) {
		myFile = fileName;
	}

	@Override
	public void listen() {
		System.out.println("Playing mp4 file. Name: " + myFile);
	}
}
