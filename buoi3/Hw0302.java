package buoi3;

import java.util.Scanner;

public class Hw0302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is Even");
        } else {
            System.out.println("The number " + number + " is Odd");
        }

        if (number > 0) {
            System.out.println("The number " + number + " is Positive");
        } else if (number < 0) {
            System.out.println("The number " + number + " is Negative");
        } else {
            System.out.println("The number " + number + " is Zero");
        }

        scanner.close();
    }
}

