package buoi4;

public class Hw0412 {
    public static void main(String[] args) {
        System.out.println("Các số hoàn hảo nhỏ hơn 10,000:");
        for (int i = 2; i < 10000; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Hàm kiểm tra số hoàn hảo
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }
}
