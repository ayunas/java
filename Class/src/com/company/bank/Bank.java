package com.company.bank;

import java.util.ArrayList;

public class Bank implements TDBank {
//    final String bankName;
//    ArrayList<Account> accounts = new ArrayList<>();

//    Bank(String bankName) {
//        this.bankName = bankName;
//    }

    @Override
    public Account addAccount(String customerName) {
        Account account = new Account(customerName);
        this.accounts.add(account);
        return account;
    }

    @Override
    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account amirAccount = bank.addAccount("amir");
        System.out.println(amirAccount.getAccountNumber());
        Account suzieAcct = bank.addAccount("suzie");
        System.out.println(suzieAcct.getAccountNumber());
        amirAccount.deposit(100);
        System.out.println(amirAccount.balance);
        amirAccount.withdraw(200);
        System.out.println(amirAccount.balance);
        ArrayList<Account> accounts = bank.getAccounts();

//        accounts.forEach(acct -> System.out.println("Account Name : " + acct.accountName + " Account Number : " + acct.getAccountNumber() + " Account Balance: " + acct.balance));
//        for(Account acct : accounts) {
//            System.out.println(acct.getAccountInfo());
//        }

        accounts.forEach(acct -> System.out.println(acct.getAccountInfo()));






    }
}
