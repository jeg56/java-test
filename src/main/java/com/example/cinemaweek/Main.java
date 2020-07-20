package com.example.cinemaweek;

/**
 * The command line implementation for my tool.
 */
public class Main {
	
	/**
	 * Implements the command line
	 * @param args the command line arguments, with the year followed by the week number.
	 */
	public static void main(String[] args) {
		CinemaWeekCommandProcessor locProcessor = new CinemaWeekCommandProcessor(new CinemaWeekHelper());
		locProcessor.process(args);
	}

}
