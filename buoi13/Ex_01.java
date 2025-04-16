package buoi13;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add number");
            System.out.println("2. Update number");
            System.out.println("3. Remove number");
            System.out.println("4. View numbers");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to add: ");
                    int numToAdd = scanner.nextInt();
                    numbers.add(numToAdd);
                    System.out.println("Number added successfully!");
                    break;
                case 2:
                    System.out.print("Enter index to update: ");
                    int indexToUpdate = scanner.nextInt();
                    if (indexToUpdate >= 0 && indexToUpdate < numbers.size()) {
                        System.out.print("Enter new number: ");
                        int newNum = scanner.nextInt();
                        numbers.set(indexToUpdate, newNum);
                        System.out.println("Number updated successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.print("Enter index to remove: ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < numbers.size()) {
                        numbers.remove(indexToRemove);
                        System.out.println("Number removed successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 4:
                    System.out.println("Current numbers: " + numbers);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}