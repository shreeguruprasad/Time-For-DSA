package hackerrank;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FindDayOfWeek {

	public static void main(String[] args) {
		
		/*
		 * Input : 08 05 2015
		 * Output : WEDNESDAY
		 * 
		 */
		
		System.out.println("08/05/2015  : " +findDay(8,5,2015));
		
		
	}
	
	public static String findDay(int month, int day, int year) {
		LocalDate date = LocalDate.of(year, month, day);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		return dayOfWeek.toString();
	}
}
