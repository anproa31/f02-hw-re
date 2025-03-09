
/* 5. Sử dụng vòng lập while để tìm số nguyên n lớn nhất thỏa mãn n^3 < 12.000.*/


public class Hw0405 {
    public static void main(String[] args) {
        int n = 0; // Khởi tạo giá trị n
        // Sử dụng vòng lặp while để tìm n lớn nhất thỏa mãn n^3 < 12.000
        while (Math.pow(n + 1, 3) < 12000) {
            n++; // Tăng giá trị của n lên 1
        }
        // In ra kết quả
        System.out.println("Số nguyên n lớn nhất thỏa mãn n^3 < 12.000 là: " + n);
    }
}
