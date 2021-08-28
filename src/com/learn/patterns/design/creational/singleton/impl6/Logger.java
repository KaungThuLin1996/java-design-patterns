package com.learn.patterns.design.creational.singleton.impl6;

/**
 * This class is a logger class for logging.
 * @author Kaung Thu Lin
 * @version 1.0
 * @since 2014-11-11
 */
public class Logger {
	
	/** Instance of Logger */
	private static Logger instance = null;
	
	/** Private Logger Constructor */
	private Logger() {
		
	}
	
	/**
	 * Get a Logger
	 * @return instance This is an instance of Logger
	 */
	public static Logger getLogger() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	/**
	 * This method will print message.
	 * @param text {@link String}
	 */
	public void log(String text) {
		System.out.println("Log >>> " + text);
	}
}
