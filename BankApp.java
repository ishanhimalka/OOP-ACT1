public class BankApp {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount("123456", 1000);
            
            BankAccount.validateAccount("123456");

            account.withdraw(1500);  

        } catch (InvalidAccountException e) {
            System.out.println("Account error: " + e.getMessage());

        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal error: " + e.getMessage());
        }

        try {
            BankAccount.validateAccount("");  
        } catch (InvalidAccountException e) {
            System.out.println("Account error: " + e.getMessage());
        }

        System.out.println("Bank application continues...");
    }
}
