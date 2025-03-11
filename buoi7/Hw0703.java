package buoi7;

import java.util.Scanner;

public class Hw0703 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter base x: ");
        int x = scanner.nextInt();

        System.out.print("Enter exponent n: ");
        int n = scanner.nextInt();

        // Ensure exponent is within valid range [0,20]
        while (n < 0 || n > 20) {
            System.out.print("Exponent must be in range [0,20]. Please enter again: ");
            n = scanner.nextInt();
        }


        System.out.println("Result: " + power(x, n));

        scanner.close();
    }

    // Recursive function to calculate x^n
    public static double power(double x, int n) {
        if (n == 0) return 1.0; // Any number raised to the power of 0 is 1
        if (n == 1) return x;
        return x * power(x, n - 1);
    }
}
