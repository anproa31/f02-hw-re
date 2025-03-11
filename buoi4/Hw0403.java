package buoi4;

import java.util.Scanner;


/*
* 3. Viết một chương trình cho phép người dùng nhập vào số lượng học sinh trong một lớp học (>= 2),
* họ tên, điểm số của từng sinh viên trong lớp.
* Hãy in ra tên của sinh viên có điểm số cao nhất và sinh viên có điểm số cao thứ hai.
* */


public class Hw0403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng học sinh
        System.out.print("Nhập số lượng học sinh (>=2): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Tiêu thụ ký tự xuống dòng

        if (n < 2) {
            System.out.println("Số lượng học sinh phải lớn hơn hoặc bằng 2.");
            return;
        }

        String topStudent = "", secondStudent = "";
        double topScore = -1, secondScore = -1;

        // Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên sinh viên: ");
            String name = scanner.nextLine();

            System.out.print("Nhập điểm số: ");
            double score = scanner.nextDouble();
            scanner.nextLine(); // Tiêu thụ ký tự xuống dòng

            if (score > topScore) {
                secondScore = topScore;
                secondStudent = topStudent;

                topScore = score;
                topStudent = name;
            } else if (score > secondScore) {
                secondScore = score;
                secondStudent = name;
            }
        }

        // Hiển thị kết quả
        System.out.println("Sinh viên có điểm cao nhất: " + topStudent + " với " + topScore);
        System.out.println("Sinh viên có điểm cao thứ hai: " + secondStudent + " với " + secondScore);

        scanner.close();
    }
}

