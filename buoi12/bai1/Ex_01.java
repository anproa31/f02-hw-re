package buoi12.bai1;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số thứ nhất: ");
            int a = scanner.nextInt();
            System.out.print("Nhập số thứ hai: ");
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0.");
        }
    }
}
