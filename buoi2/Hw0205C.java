package buoi2;

import java.util.Scanner;

public class Hw0205C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();


        System.out.print("Enter age: ");
        int age = scanner.nextInt();


        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();


        System.out.println("\n--- Person Information ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.printf("Height: %.2fm\n", height);


        scanner.close();
    }
}

