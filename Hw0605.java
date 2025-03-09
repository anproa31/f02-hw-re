import java.util.Scanner;

public class Hw0605 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of magic wands found
        System.out.print("Number of magic wands found: ");
        int n = scanner.nextInt();
        int[] wands = new int[n];
        int[] boxes = new int[n];

        // Input the lengths of magic wands
        System.out.println("Enter the lengths of magic wands: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Wand " + (i + 1) + ": ");
            wands[i] = scanner.nextInt();
        }
        insertionSort(wands); // Sort the wands in ascending order

        // Input the lengths of the boxes
        System.out.println("Enter the lengths of the boxes: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Box " + (i + 1) + ": ");
            boxes[i] = scanner.nextInt();
        }
        insertionSort(boxes); // Sort the boxes in ascending order

        // Check if all wands can fit into the corresponding boxes
        if (isPortable(wands, boxes)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Insertion Sort to sort an array in ascending order
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Check if each wand can fit into its corresponding box
    public static boolean isPortable(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) return false; // Wand is too long for the box
        }
        return true; // All wands fit into their respective boxes
    }
}

