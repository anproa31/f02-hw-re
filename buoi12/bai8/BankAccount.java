package buoi12.bai8;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void fundout(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Số dư không đủ để rút.");
        }
        balance -= amount;
        System.out.println("Rút tiền thành công. Số dư còn lại: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
