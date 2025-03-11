package buoi7.buoi6;

public class Hw0604 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 2, 10};
        int k = 2;
        bubbleSort(arr); // Sort array in ascending order
        System.out.println(maxDifference(arr, k));
    }

    // Bubble Sort to arrange elements in ascending order
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Calculate the maximum difference between two groups of elements
    public static int maxDifference(int[] arr, int k) {
        int sumTotal = 0;
        for (int num : arr) {
            sumTotal += num; // Calculate total sum of the array
        }

        // Compute difference by selecting the first K elements as the smaller group
        int sumSmall1 = 0;
        for (int i = 0; i < k; i++) {
            sumSmall1 += arr[i];
        }
        int diff1 = (sumTotal - sumSmall1) - sumSmall1;

        // Compute difference by selecting the last K elements as the smaller group
        int sumSmall2 = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            sumSmall2 += arr[i];
        }
        int diff2 = sumSmall2 - (sumTotal - sumSmall2);

        return Math.max(diff1, diff2); // Return the maximum difference
    }
}

