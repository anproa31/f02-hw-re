package buoi7.buoi6;

import java.util.Scanner;

public class Hw0601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter element " + (i + 1) + " (0-20): ");
                int value = scanner.nextInt();
                if (value >= 0 && value <= 20) {
                    array[i] = value;
                    break;
                } else {
                    System.out.println("Invalid value! Please enter again.");
                }
            }
        }

        sortByFrequency(array);
        System.out.print("Sorted array by frequency: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void sortByFrequency(int[] arr) {
        int[] freq = new int[21];
        int[] firstIndex = new int[21];

        for (int i = 0; i < 21; i++) {
            firstIndex[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
            if (firstIndex[arr[i]] == -1) {
                firstIndex[arr[i]] = i;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && (freq[arr[j]] < freq[key] ||
                    (freq[arr[j]] == freq[key] && firstIndex[arr[j]] > firstIndex[key]))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
