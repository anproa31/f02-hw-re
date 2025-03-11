package buoi6;

public class Hw0602 {
    public static void main(String[] args) {
        int[] arr = {9, 7, 12, 8, 6, 5};
        bubbleSort(arr); // Sort array in ascending order
        rearrange(arr);  // Rearrange elements in the required pattern
    }

    // Bubble Sort to arrange elements in ascending order
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Rearrange array elements in the desired format
    public static void rearrange(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (left != right) System.out.print(arr[right--] + " "); // Pick the largest available element
            System.out.print(arr[left++] + " ");  // Pick the smallest available element
        }
    }
}

