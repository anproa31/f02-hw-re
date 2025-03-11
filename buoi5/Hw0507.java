package buoi5;

import java.util.Scanner;

public class Hw0507 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    result = arr[i];
                    break;
                }
            }
            if (result != -1) break;
        }

        System.out.println(result == -1 ? "NO" : result);
        scanner.close();
    }
}
