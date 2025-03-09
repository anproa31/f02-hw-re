import java.util.Scanner;

public class Hw0407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số n: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Số n không được là số âm. Vui lòng nhập lại.");
            }
        } while (n < 0);
        System.out.println(n + "! = " + factorial(n));
    }

    // Hàm tính giai thừa
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
