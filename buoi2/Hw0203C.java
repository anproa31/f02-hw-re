package buoi2;

import java.util.Scanner;

public class Hw0203C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of minutes: ");
        int totalMinutes = scanner.nextInt();

        // Constants for conversion
        final int MINUTES_IN_YEAR = 525600;  // 365 days * 24 hours * 60 minutes
        final int MINUTES_IN_DAY = 1440;     // 24 hours * 60 minutes
        final int MINUTES_IN_HOUR = 60;

        // Convert minutes to years, days, hours, and remaining minutes
        int years = totalMinutes / MINUTES_IN_YEAR;
        int remainingMinutes = totalMinutes % MINUTES_IN_YEAR;

        int days = remainingMinutes / MINUTES_IN_DAY;
        remainingMinutes %= MINUTES_IN_DAY;

        int hours = remainingMinutes / MINUTES_IN_HOUR;
        int minutes = remainingMinutes % MINUTES_IN_HOUR;

        System.out.printf("%d minutes is equivalent to: %d years, %d days, %d hours, %d minutes.\n",
                totalMinutes, years, days, hours, minutes);

        scanner.close();
    }
}

