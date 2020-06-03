public class BankTeller {
    public static void main(String[] args) {
        BankAccount x = new BankAccount();
        BankAccount y = new BankAccount();
        BankAccount.getNumberOfAccounts();
        x.depositChecking(142.75);
        x.getCheckingBalance();
        x.depositSavings(24.50);
        x.getSavingsBalance();
        x.withdrawChecking(42.75);
        x.getCheckingBalance();
        x.withdrawSavings(19.99);
        x.getSavingsBalance();
        y.getAccountNumber();
        y.depositChecking(10);
        y.withdrawChecking(20);
        BankAccount.getTotalBalance();
    }
}