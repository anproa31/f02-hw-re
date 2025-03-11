package buoi7;

import java.util.Scanner;

public class Hw0701 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the array length: ");
        int n = scanner.nextInt();


        while (n < 2) {
            System.out.println("The array must have at least two elements, please enter again!");
            System.out.print("Enter the array length: ");
            n = scanner.nextInt();
        }

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }


        int[] result = findMin(arr);
        System.out.println("The smallest element in the array is: " + result[0]);
        System.out.println("The second smallest element in the array is: " + result[1]);
    }

    // Method to find the smallest and second smallest elements
    public static int[] findMin(int[] arr) {
        int min = arr[0];
        int min2 = arr[1];

        // Ensure min is the smallest and min2 is the second smallest initially
        if (min > min2) {
            min = arr[1];
            min2 = arr[0];
        }

        // Iterate through the array to find the smallest and second smallest elements
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min; // Update second smallest
                min = arr[i]; // Update smallest
            } else if (arr[i] > min && arr[i] < min2) {
                min2 = arr[i]; // Update second smallest if it's greater than min but smaller than min2
            }
        }

        return new int[]{min, min2};
    }
}

