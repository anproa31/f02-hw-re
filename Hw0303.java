import java.util.Scanner;

public class Hw0303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        if (b != 0) {
            System.out.println((double) a / b);
        } else {
            System.out.println("Cannot divide by zero");
        }

        scanner.close();
    }
}

