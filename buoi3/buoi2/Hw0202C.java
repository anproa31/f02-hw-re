package buoi3.buoi2;

import java.util.Scanner;

public class Hw0202C {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the method");
        System.out.println("1. From Fahrenheit to Celsius");
        System.out.println("2. From Celsius to Fahrenheit");
        System.out.print("Choose one (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Fahrenheit input value (°F): ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f °F to %.2f °C.\n", fahrenheit, celsius);
        } else if (choice == 2) {
            System.out.print("Celsius input value (°C): ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f °C to %.2f °F.\n", celsius, fahrenheit);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

