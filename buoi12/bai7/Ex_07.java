package buoi12.bai7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_07 {
    public static void main(String[] args) {
        String filePath = "output.txt";
        String content = "Đây là nội dung được ghi ra file sử dụng try-with-resources.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Ghi file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
