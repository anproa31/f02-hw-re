package buoi4;

import java.util.Scanner;

public class Hw0413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0], count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } else if (arr[i] == max) {
                count++;
            }
        }
        System.out.println("Số lớn nhất: " + max + ", xuất hiện " + count + " lần.");
    }
}
