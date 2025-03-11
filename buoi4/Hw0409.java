package buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class Hw0409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int secondLargest = arr[n - 2];
        System.out.println("Số lớn thứ 2: " + secondLargest);
    }
}
