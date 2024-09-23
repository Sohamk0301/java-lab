package com.deloitte.lab03.ex07;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateCal {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a date (yyyy-MM-dd): ");
	        String inputDate = scanner.nextLine();
	        
	        printDuration(inputDate);
	        scanner.close();
	    }

	    public static void printDuration(String inputDate) {
	        // Define the date format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        // Parse the input date
	        LocalDate startDate = LocalDate.parse(inputDate, formatter);
	        LocalDate currentDate = LocalDate.now();

	        // Calculate the duration
	        Period period = Period.between(startDate, currentDate);

	        // Extract years, months, and days
	        int years = period.getYears();
	        int months = period.getMonths();
	        int days = period.getDays();

	        System.out.printf("Duration from %s to today is: %d years, %d months, and %d days.%n", 
	                          inputDate, years, months, days);
	    }
}
