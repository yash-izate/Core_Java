package basic;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
    public static void main(String[] args) {

        // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date : " + today);

        // Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time : " + time);

        // Current Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current DateTime : " + dateTime);

        // Individual fields
        System.out.println("Year  : " + today.getYear());
        System.out.println("Month : " + today.getMonth());
        System.out.println("Day   : " + today.getDayOfMonth());

        // Adding and subtracting
        System.out.println("Tomorrow : " + today.plusDays(1));
        System.out.println("Next Month : " + today.plusMonths(1));
        System.out.println("Previous Year : " + today.minusYears(1));

        // Day of week
        System.out.println("Day of Week : " + today.getDayOfWeek());

        // Specific date
        LocalDate birthday = LocalDate.of(2004, 11, 15);
        System.out.println("Birthday : " + birthday);

        // Comparing dates
        System.out.println("Is birthday before today? "
                + birthday.isBefore(today));

        // Period between dates
        Period age = Period.between(birthday, today);
        System.out.println("Age : "
                + age.getYears() + " years "
                + age.getMonths() + " months "
                + age.getDays() + " days");

        // Duration between times
        LocalTime start = LocalTime.of(10, 30);
        LocalTime end = LocalTime.of(13, 45);

        Duration duration = Duration.between(start, end);
        System.out.println("Duration : "
                + duration.toHours() + " hours");

        // Formatting date and time
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatted = dateTime.format(formatter);
        System.out.println("Formatted DateTime : " + formatted);
    }
}