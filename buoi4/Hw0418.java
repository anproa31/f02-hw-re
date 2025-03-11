package buoi4;

import java.util.Scanner;

public class Hw0418 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phép toán (a+b=c): ");
        String input = scanner.nextLine();
        String[] parts = input.split("[+=]");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        System.out.println((a + b == c) ? "YES" : "NO");
    }
}
