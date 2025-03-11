package buoi4;

import java.util.Scanner;

public class Hw0416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương: ");
        int n = scanner.nextInt();
        String s = Integer.toString(n);
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
