package basic;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {

        // Create a Calendar object with current date and time
        Calendar cal = Calendar.getInstance();

        // Current date and time
        System.out.println("Current Date and Time : " + cal.getTime());

        // Individual fields
        System.out.println("Year        : " + cal.get(Calendar.YEAR));
        System.out.println("Month       : " + (cal.get(Calendar.MONTH) + 1)); // Months start from 0
        System.out.println("Day         : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour        : " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute      : " + cal.get(Calendar.MINUTE));
        System.out.println("Second      : " + cal.get(Calendar.SECOND));

        // Day of week
        System.out.println("Day of Week : " + cal.get(Calendar.DAY_OF_WEEK));

        // Add 10 days
        cal.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("\nAfter adding 10 days : " + cal.getTime());

        // Subtract 2 months
        cal.add(Calendar.MONTH, -2);
        System.out.println("After subtracting 2 months : " + cal.getTime());

        // Set a specific date
        cal.set(2025, Calendar.DECEMBER, 25);
        System.out.println("Set Date : " + cal.getTime());

        // Maximum and minimum values
        System.out.println("Maximum days in month : "
                + cal.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println("Minimum day in month : "
                + cal.getActualMinimum(Calendar.DAY_OF_MONTH));

        // Check leap year
        int year = cal.get(Calendar.YEAR);
        boolean isLeap =
                (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        System.out.println("Is " + year + " a leap year? " + isLeap);
    }
}