package buoi3;

import java.util.Scanner;

public class Hw0305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int a = scanner.nextInt();
        System.out.println("Enter the width: ");
        int b = scanner.nextInt();

        if ((a <= 0 || b <= 0) || (a < b)) {
            System.out.println("One or both numbers are zero or negative or height < width. Calculation not performed.");
        } else {
            System.out.println("The perimeter is: " + 2 * (a + b));
            System.out.println("The area is: " + a * b);
        }

        scanner.close();
    }
}
