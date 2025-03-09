
/* 4. Viết chương trình liệt kê các số trong khoảng [100; 200] chia hết cho 5 hoặc chia hết cho 6.
Số chia hết cho cả 5 và 6 là không hợp lệ.
*/

public class Hw0404 {
    public static void main(String[] args) {
        // Duyệt qua các số từ 100 đến 200
        System.out.println("Các số chia hết cho 5 hoặc 6 nhưng không chia hết cho cả 5 và 6 từ 100 đến 200 là: ");
        for (int i = 100; i <= 200; i++) {
            // Kiểm tra điều kiện chia hết cho 5 hoặc 6 nhưng không chia hết cho cả 5 và 6
            if ((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0)) {
                System.out.println(i);
            }
        }
    }
}
