package buoi2;

import java.util.Scanner;

public class Hw0204C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input day, month, and year
        System.out.print("Input: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        // Format the date as dd/MM/yyyy
        String formattedDate = String.format("%02d/%02d/%04d", day, month, year);
        System.out.println("Formatted date: " + formattedDate);

        scanner.close();
    }
}

