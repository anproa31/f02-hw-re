package buoi4;

import java.util.Scanner;


/* 1. Viết một chương trình đọc một số lượng số nguyên không xác định,
xác định có bao nhiêu giá trị dương và âm đã được đọc và tính tổng và giá trị trung bình của các giá trị đầu vào
(không tính số 0). Chương trình kết thúc khi nhập vào số 0. */

public class Hw0401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;
        int sum = 0;
        int count = 0;

        System.out.println("Nhập các số nguyên (Nhập 0 để kết thúc):");

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break; // Thoát vòng lặp ngay khi nhập số 0
            }

            if (num > 0) {
                countPositive++;
            } else {
                countNegative++;
            }

            sum += num;
            count++;
        }

        scanner.close(); // Đóng Scanner sau khi sử dụng

        System.out.println("Số lượng số dương: " + countPositive);
        System.out.println("Số lượng số âm: " + countNegative);
        System.out.println("Tổng các số: " + sum);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Giá trị trung bình: " + average);
        } else {
            System.out.println("Không có số hợp lệ để tính trung bình.");
        }
    }
}

