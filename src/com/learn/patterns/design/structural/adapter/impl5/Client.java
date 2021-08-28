package com.learn.patterns.design.structural.adapter.impl5;

public class Client {

	public static void main(String[] args) {
		MediaPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "One Thing.mp3");
		
		AdvancedMediaPlayer mp4Player = new Mp4Player();
		AdvancedMediaPlayerAdapter advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
		advancedMediaPlayerAdapter1.play("mp4", "What Makes You Beautiful.mp4");
		
		AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
		AdvancedMediaPlayerAdapter advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
		advancedMediaPlayerAdapter2.play("vlc", "Baby.vlc");
		
		audioPlayer.play("vlc", "Far Far Away.vlc");
	}
}
