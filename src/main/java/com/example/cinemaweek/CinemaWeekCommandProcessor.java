package com.example.cinemaweek;

/**
 * A class for processing commands launched from the command line.
 */
public class CinemaWeekCommandProcessor {
	
	private final CinemaWeekHelper helper;
	
	/**
	 * Constructs a {@link CinemaWeekCommandProcessor}.
	 * 
	 * @param argHelper a non null {@link CinemaWeekHelper}
	 */
	public CinemaWeekCommandProcessor(CinemaWeekHelper argHelper) {
		helper = argHelper;
	}
	
	/**
	 * Processes a command with the specified arguments, then either
	 * prints a date to standard output or prints ERROR to standard
	 * error.
	 * 
	 * @param args the command arguments
	 */
	public void process(String[] args) {
		if ( args == null || args.length != 2) {
			System.err.println("ERROR");
			return;
		}
		try {
			System.out.println(helper.getStartingWednesday(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		} catch (IllegalArgumentException e) {
			System.err.println("ERROR");
		}
	}

}
