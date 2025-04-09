package buoi12.bai2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print("Nhập một số nguyên: ");
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên.");
                scanner.nextLine(); // Xóa dữ liệu sai
            }
        }
        System.out.println("Số bạn vừa nhập là: " + number);
    }
}
