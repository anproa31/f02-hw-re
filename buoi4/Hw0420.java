package buoi4;

import java.util.Scanner;

public class Hw0420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0 && i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Số ước số của " + N + " chia hết cho 2: " + count);
    }
}
