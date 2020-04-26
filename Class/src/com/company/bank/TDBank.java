package com.company.bank;

import java.util.ArrayList;

public interface TDBank {
    String bankName = "TDBank";
    ArrayList<Account> accounts = new ArrayList<>();
    Account addAccount(String customerName);
    ArrayList<Account> getAccounts();
}
