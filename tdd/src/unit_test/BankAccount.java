package unit_test;

public class BankAccount {
    String first;
    String last;
    private double balance;
    private String accountType;
    static final int CHECKING = 1;
    static final int SAVINGS = 2;

    public BankAccount(String first, String last, double balance, String type) {
        this.first = first;
        this.last = last;
        this.balance = balance;
        this.accountType = type;
    }

    //brarnch == true if customer at branch.  branch == false, if customer at an ATM
    double deposit(double amount, boolean branch) {
        this.balance += amount;
        return this.balance;
    }

    double withdraw(double amount, boolean branch) {
        this.balance -= amount;
        return this.balance;
    }

    double getBalance() {
        return this.balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public static void main(String[] args) {
        BankAccount acct = new BankAccount("amir","yunas",100.00,"checking");
        System.out.println(acct.getBalance());

    }

}
