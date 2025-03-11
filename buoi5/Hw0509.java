package buoi5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw0509 {
    private static File outputFile = new File("output.txt");

    public static int[] readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] readFromFile(String filename) throws IOException {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filename));

        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void printToConsole(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void writeToFile(int[] arr, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int num : arr) {
                writer.print(num + " ");
            }
        }
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMinIndex(int[] arr) {
        int min = findMin(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                return i;
            }
        }
        return -1;
    }

    public static int findMaxIndex(int[] arr) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                return i;
            }
        }
        return -1;
    }

    public static int findFirstIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastIndex(int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int i, int j) {
        if (i >= 0 && i < arr.length && j >= 0 && j < arr.length) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = readFromConsole();
        printToConsole(arr);
        System.out.println("Sum: " + sumArray(arr));
        System.out.println("Max: " + findMax(arr));
        System.out.println("Min: " + findMin(arr));
        System.out.println("Min Index: " + findMinIndex(arr));
        System.out.println("Max Index: " + findMaxIndex(arr));
        System.out.println("First Index of 5: " + findFirstIndex(arr, 5));
        System.out.println("Last Index of 5: " + findLastIndex(arr, 5));

        try {
            writeToFile(arr, outputFile.getName());
            System.out.println("Array written to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
