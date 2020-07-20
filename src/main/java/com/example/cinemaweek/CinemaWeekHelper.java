package com.example.cinemaweek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * A helper class to deal with cinema weeks.
 */
public class CinemaWeekHelper {
	
	/**
	 * Determines the exact date of the starting Wednesday given a year and a cinema
	 * week number.
	 * 
	 * @param year the year
	 * @param week the week number
	 * @return the date of the starting Wednesday
	 */
	public LocalDate getStartingWednesday(int year, int week) {
		if (week < 1) {
			throw new IllegalArgumentException("Illegal week number " + week);
		}
		// Get January the first
		LocalDate locDateInProgress = LocalDate.of(year, Month.JANUARY, 1);
		// Get first day of week 1
		DayOfWeek locDayOfWeek = locDateInProgress.getDayOfWeek();
		if (locDayOfWeek == DayOfWeek.THURSDAY || locDayOfWeek == DayOfWeek.FRIDAY || locDayOfWeek == DayOfWeek.SATURDAY) {
			locDateInProgress = locDateInProgress.minusWeeks(1);
		}
		locDateInProgress = locDateInProgress.plusDays(offsetToWednesday(locDayOfWeek));
		locDateInProgress = locDateInProgress.plusWeeks(week - 1);
		if (locDateInProgress.plusDays(3).getYear() > year) {
			throw new IllegalArgumentException("Illegal week number " + week);
		}
		return locDateInProgress;
	}
	
	private int offsetToWednesday(DayOfWeek dayOfWeek) {
		return (7 + DayOfWeek.WEDNESDAY.getValue() - dayOfWeek.getValue()) % 7;
	}

}
