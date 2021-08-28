package com.learn.patterns.design.behavioral.memento.impl1;

public class Client {

	public static void main(String[] args) {
		FileWriterCareTaker careTaker = new FileWriterCareTaker();
		
		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
		
		fileWriter.write(" => Hello! You are welcome.");
		
		careTaker.save(fileWriter);
		System.out.println(fileWriter + "\n");
		
		fileWriter.write("\nHa Ha I'm not saved.");
		System.out.println(fileWriter + "\n");
		
		careTaker.undo(fileWriter);
		
		System.out.println(fileWriter + "\n");
	}
}
