import java.util.Scanner;

public class Hw0704 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter n (0 < n < 1000): ");
        int n = scanner.nextInt();


        while (n <= 0 || n >= 1000) {
            System.out.print("n must be between 1 and 999. Please enter again: ");
            n = scanner.nextInt();
        }


        System.out.println("Sum: " + recursiveSum(n));

        scanner.close();
    }

    // Recursive function to calculate sum of first n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) return 1; // Base case: sum of first natural number is 1
        return n + recursiveSum(n - 1); // Recursive call
    }

}

