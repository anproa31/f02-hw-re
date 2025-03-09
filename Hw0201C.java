import java.util.Scanner;

public class Hw0201C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value: ");
        double inch = scanner.nextDouble();
        double cm = inch * 2.54;
        System.out.println(inch + " inch to cm is: " + cm + " cm.");

        scanner.close();
    }
}

