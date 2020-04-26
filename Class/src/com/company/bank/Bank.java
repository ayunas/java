package com.company.bank;

import java.util.ArrayList;

public class Bank {
    final String bankName;
    ArrayList<Account> accounts = new ArrayList<>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    Account addAccount(String customerName) {
        Account account = new Account(customerName);
        this.accounts.add(account);
        return account;
    }

    ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("TD");
        Account amirAccount = bank.addAccount("amir");
        System.out.println(amirAccount.getAccountNumber());
        Account suzieAcct = bank.addAccount("suzie");
        System.out.println(suzieAcct.getAccountNumber());
        amirAccount.deposit(100);
        System.out.println(amirAccount.balance);
        amirAccount.withdraw(200);
        System.out.println(amirAccount.balance);
    }

}
