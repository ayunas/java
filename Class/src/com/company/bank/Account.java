package com.company.bank;

import java.util.HashMap;

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

    HashMap<String,String> getAccountInfo() {
        HashMap<String,String> accountInfo = new HashMap<>();
        accountInfo.put("Account Name", this.accountName);
        accountInfo.put("Account Number", Long.toString(this.accountNumber));
        accountInfo.put("Account balance", Double.toString(this.balance));
        return accountInfo;
    }



}
