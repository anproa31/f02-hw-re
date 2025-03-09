import java.util.Scanner;

public class Hw0411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        System.out.println("Các số chính phương nhỏ hơn " + n + ":");
        for (int i = 1; i * i < n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
