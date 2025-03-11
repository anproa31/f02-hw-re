package buoi4;

import java.util.Scanner;

public class Hw0415 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();

        int gcd = gcd(a, b);
        int lcm = lcm(a, b);
        System.out.println("ƯCLN: " + gcd);
        System.out.println("BCNN: " + lcm);
    }

    // Hàm tính ƯCLN
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm tính BCNN
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
