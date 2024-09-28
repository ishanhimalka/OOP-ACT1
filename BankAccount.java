public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal of $" + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
    }

    public static void validateAccount(String accountNumber) throws InvalidAccountException {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new InvalidAccountException("Invalid account number: " + accountNumber);
        }
        System.out.println("Account number " + accountNumber + " is valid.");
    }

    public double getBalance() {
        return balance;
    }
}
