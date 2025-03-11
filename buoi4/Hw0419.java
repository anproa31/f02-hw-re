package buoi4;

import java.util.Scanner;

public class Hw0419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        String s = scanner.nextLine();
        boolean isIncreasing = true, isDecreasing = true;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) isIncreasing = false;
            if (s.charAt(i) > s.charAt(i - 1)) isDecreasing = false;
        }
        System.out.println((isIncreasing || isDecreasing) ? "YES" : "NO");
    }
}
