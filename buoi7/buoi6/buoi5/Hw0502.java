package buoi7.buoi6.buoi5;

import java.util.Scanner;

public class Hw0502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to find: ");
        int target = scanner.nextInt();

        // Call the function to find and print indices
        findIndex(array, target);
    }

    public static void findIndex(int[] arr, int n) {
        int[] indexs = new int[arr.length];
        int numberIndexs = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                indexs[numberIndexs] = i;
                numberIndexs++;
            }
        }

        if (numberIndexs == 0)
            System.out.print(-1);
        else {
            for (int i = 0; i < numberIndexs; i++) {
                System.out.print(indexs[i]);
                if (i < numberIndexs - 1)
                    System.out.print(", ");
            }
            System.out.println();
        }
    }
}
