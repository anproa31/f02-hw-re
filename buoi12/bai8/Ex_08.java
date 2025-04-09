package buoi12.bai8;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(500.0);

        try {
            System.out.print("Nhập số tiền cần rút: ");
            double amount = scanner.nextDouble();
            account.fundout(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Giao dịch thất bại: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        }
    }
}
