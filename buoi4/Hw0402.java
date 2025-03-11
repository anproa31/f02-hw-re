package buoi4;/* 2. Giả sử học phí của một trường đại học là 10.000 đô la trong năm nay và tăng 5% mỗi năm.
Trong một năm, học phí sẽ là 10.500 đô la.
Viết một chương trình hiển thị học phí trong 10 năm tới và tổng chi phí học phí của 4 năm bắt đầu từ năm thứ 11.
*/

public class Hw0402 {
    public static void main(String[] args) {
        double tuition = 10000; // Học phí ban đầu
        double rate = 0.05; // Tỷ lệ tăng hàng năm

        // Hiển thị học phí trong 10 năm tới
        System.out.println("Học phí trong 10 năm tới:");
        for (int year = 1; year <= 10; year++) {
            tuition += tuition * rate;
            System.out.printf("Năm %d: %.2f USD%n", year, tuition);
        }

        // Tính tổng chi phí học phí của 4 năm bắt đầu từ năm thứ 11
        double totalCost = 0;
        for (int year = 11; year <= 14; year++) {
            tuition += tuition * rate;
            totalCost += tuition;
        }

        System.out.printf("Tổng chi phí học phí trong 4 năm từ năm thứ 11 đến năm thứ 14: %.2f USD%n", totalCost);
    }
}

