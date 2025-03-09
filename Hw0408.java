import java.util.Scanner;

public class Hw0408 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền T: ");
        int T = scanner.nextInt();
        int[] denominations = {500, 200, 100, 20, 10, 5, 2, 1};
        int totalNotes = 0;

        System.out.println("Số tờ mỗi loại:");
        for (int d : denominations) {
            int count = T / d;
            if (count > 0) {
                System.out.println(d + ": " + count);
                T %= d;
                totalNotes += count;
            }
        }
        System.out.println("Tổng số tờ: " + totalNotes);
    }
}
