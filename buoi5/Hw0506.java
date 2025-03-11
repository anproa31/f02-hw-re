package buoi5;

import java.util.Scanner;

public class Hw0506 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        boolean isSymmetric = true;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                isSymmetric = false;
                break;
            }
        }

        System.out.println(isSymmetric ? "YES" : "NO");
    }
}
