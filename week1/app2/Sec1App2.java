package sec1.app2;
public class Sec1App2 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
        account.getMonthlyInterest());
        System.out.println("This account was created at " +
        account.getDateCreated());
    }
}
