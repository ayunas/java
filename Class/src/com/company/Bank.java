package com.company;

public class Bank {

    private String account;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Bank() {
        this("Account Holder", "account@bank.com", 0.00, "000-000-0000","0000000" );
        System.out.println("Empty constructor called");
    }

    public Bank(String name, String email, double balance, String phone, String account) {
            this.name = name;
            this.email = email;
            this.balance = balance;
            this.phone = phone;
            this.account = account;
    }



    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if ((this.balance - amount) < 0) {
            System.out.println("Cannot withdraw that amount.  Insufficient funds. Current balance only: "  + this.balance);
            System.exit(-1);
        }
        this.balance -= amount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
