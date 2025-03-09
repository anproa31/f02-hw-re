import java.util.Scanner;

public class Hw0702 {
    // Method to perform Binary Search
    public static int binarySearch(int[] A, int X) {
        int left = 0, right = A.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents overflow compared to (left + right) / 2

            if (A[mid] == X) return 1;   // Found X, return 1
            if (A[mid] < X) left = mid + 1;  // Search in the right half
            else right = mid - 1;  // Search in the left half
        }

        return -1; // X not found in the array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] A = new int[n];


        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }


        System.out.print("Enter the number to search: ");
        int X = scanner.nextInt();


        System.out.println(binarySearch(A, X));

        scanner.close();
    }
}
