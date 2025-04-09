package buoi12.bai6;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            try {
                System.out.print("Nhập một số nguyên: ");
                String input = scanner.nextLine();
                number = Integer.parseInt(input);
                if (number < 0) {
                    throw new NumberFormatException("Số âm không hợp lệ.");
                }
                System.out.println("Số hợp lệ: " + number);
                break;
            } catch (NumberFormatException e) {
                try {
                    throw new NegativeNumberException("Lỗi: Số không được là số âm. Vui lòng nhập lại.");
                } catch (NegativeNumberException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
