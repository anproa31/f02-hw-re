package buoi4;

import java.util.Scanner;

public class Hw0414 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        int[] count = new int[256];

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < 256; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) i;
            }
        }
        System.out.println("Ký tự xuất hiện nhiều nhất: " + maxChar + " (" + maxCount + " lần)");
    }
}
