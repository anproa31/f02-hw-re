package buoi13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number with space: ");
        String input = sc.nextLine();

        String[] numberStrings = input.split("\\s+");
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (String numberStr : numberStrings) {
            try {
                int num = Integer.parseInt(numberStr);
                uniqueNumbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid number: " + numberStr);
            }
        }

        System.out.println("Number of unique numbers: " + uniqueNumbers.size());
        System.out.println("Unique numbers:\n" + uniqueNumbers);

        sc.close();
    }
}
