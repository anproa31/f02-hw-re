package buoi12.bai3;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số thứ nhất: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập số thứ hai: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Tổng: " + (a + b));
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Nhập sai định dạng số.");
        } finally {
            System.out.println("Kết thúc chương trình.");
        }
    }
}
