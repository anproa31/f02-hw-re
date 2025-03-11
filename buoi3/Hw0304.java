package buoi3;

import java.util.Scanner;

public class Hw0304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("The number " + a + " is greater than " + b);
        } else if (a < b) {
            System.out.println("The number " + a + " is smaller than " + b);
        } else {
            System.out.println("The number " + a + " is equal with " + b);
        }

        scanner.close();
    }
}

