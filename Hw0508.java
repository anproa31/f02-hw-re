

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Hw0508 {

    public static void main(String[] args) {
        File inputFile = new File("input.txt");

        int[] numbers = new int[1000];
        int[] count = {0};

        numbers = readNumbersFromFile(inputFile, numbers, count);

        int[] uniqueNumbers = new int[count[0]];
        int[] occurrences = new int[count[0]];
        int uniqueCount = 0;

        for (int i = 0; i < count[0]; i++) {
            if (containsOnlyPrimeDigits(numbers[i])) {
                int index = findIndex(uniqueNumbers, uniqueCount, numbers[i]);
                if (index == -1) {
                    uniqueNumbers[uniqueCount] = numbers[i];
                    occurrences[uniqueCount] = 1;
                    uniqueCount++;
                } else {
                    occurrences[index]++;
                }
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueNumbers[i] + " " + occurrences[i]);
        }
    }

    public static int[] readNumbersFromFile(File inputFile, int[] numbers, int[] count) {
        try (Scanner scanner = new Scanner(inputFile)) {
            while (scanner.hasNext()) {
                if (count[0] == numbers.length) {
                    numbers = Arrays.copyOf(numbers, numbers.length * 2);
                }
                if (scanner.hasNextInt()) {
                    numbers[count[0]] = scanner.nextInt();
                    count[0]++;
                } else {
                    scanner.next();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFile.getAbsolutePath());
        }
        return numbers;
    }

    public static boolean containsOnlyPrimeDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static int findIndex(int[] arr, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
