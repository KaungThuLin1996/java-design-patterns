package com.learn.patterns.design.structural.adapter.impl5;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}

	@Override
	public void play(String audioType, String fileName) {
		advancedMediaPlayer.loadFileName(fileName);
		advancedMediaPlayer.listen();
	}
}
