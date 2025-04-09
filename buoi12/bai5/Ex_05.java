package buoi12.bai5;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập tuổi: ");
            int age = scanner.nextInt();
            if (age < 6) {
                throw new InvalidAgeException("Tuổi phải lớn hơn hoặc bằng 6.");
            }
            System.out.println("Tuổi hợp lệ: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
