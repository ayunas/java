package com.company.bank;

public class Account {
    String accountName;
    private long accountNumber;
    double balance=0;

    Account(String name) {
        this.accountName = name;
        this.accountNumber = (long) (Math.random()*1000000);
    }

    double withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Cannot withdraw that amount.  Not enough balance.");
            return this.balance;
        }
        this.balance -= amount;
        return this.balance;
    }

    double deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " to " + this.accountName + " bank account");
        return this.balance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

}
