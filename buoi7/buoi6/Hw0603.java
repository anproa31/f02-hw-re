package buoi7.buoi6;

import java.util.Scanner;

public class Hw0603 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter element " + (i + 1) + " (1-100): ");
                int value = scanner.nextInt();
                if (value > 0 && value < 100) {
                    array[i] = value;
                    break;
                } else {
                    System.out.println("Invalid value! Please enter again.");
                }
            }
        }

        System.out.println(findMissingElementsCount(array));
    }

    // Find the number of missing elements in a sorted array sequence
    public static int findMissingElementsCount(int[] arr) {
        selectionSort(arr);

        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff > 1) {
                count += diff - 1;
            }
        }

        return count;
    }

    // Selection Sort to arrange elements in ascending order
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}

