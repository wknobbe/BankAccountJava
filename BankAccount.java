import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance = 0;
    private double savingsBalance = 0;
    private static int numberOfAccounts = 0;
    private static double totalBalance = 0;
    public BankAccount() {
        accountNumber = accNumCreator();
        numberOfAccounts++;
    }
    private String accNumCreator(){
        String options = "0123456789";
        String accnumb = "";
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            String num = Character.toString(options.charAt(r.nextInt(10)));
            accnumb += num;
        }
        return accnumb;
    }
    public double getCheckingBalance(){
        System.out.println("Checking Balance: " + checkingBalance);
        return checkingBalance;
    }
    public double getSavingsBalance(){
        System.out.printf("Savings Balance: " + savingsBalance);
        return savingsBalance;
    }
    public void depositChecking(double input){
        checkingBalance += input;
        totalBalance += input;
        System.out.println("You deposited " + input);
    }
    public void withdrawChecking(double input){
        if (input < checkingBalance){
            checkingBalance -= input;
            totalBalance -= input;
            System.out.println("You withdrew: " +input);
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }
    public void depositSavings(double input){
        savingsBalance += input;
        totalBalance += input;
        System.out.println("You deposited: " + input);
    }
    public void withdrawSavings(double input){
        if (input < savingsBalance){
            savingsBalance -= input;
            totalBalance -= input;
            System.out.println("You withdrew: " + input);
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }
    public void getAccountNumber(){
        System.out.println(accountNumber);
    }
    public static void getNumberOfAccounts(){
        System.out.println(numberOfAccounts);
    }
    public static void getTotalBalance(){
        System.out.println(totalBalance);
    }

}