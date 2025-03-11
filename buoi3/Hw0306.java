package buoi3;

import java.util.Scanner;

public class Hw0306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first edge: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second edge: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the third edge: ");
        double c = scanner.nextDouble();

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("These three edges CAN form a triangle");
            } else {
                System.out.println("These three edges CANNOT form a triangle");
            }
        } else {
            System.out.println("All edges must be greater than 0");
        }

        scanner.close();
    }
}

