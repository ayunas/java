package unit_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    static BankAccount account = new BankAccount("amir","yunas",1000,"checking");


    @Test
    void deposit() {
        BankAccount acct1 = new BankAccount("ibrahim","yunas",1000,"savings");
        double balance = acct1.withdraw(200,true);
        assertEquals(balance,800);

    }

    @Test
    void withdraw() {
        fail("empty withdraw test");
    }

    @Test
    void getBalance() {
        fail("empty getBalance test");
    }

    @Test
    void checkName() {
        BankAccount acct2 = new BankAccount("susan","walker",500,"checking");
        assertEquals(acct2.first,"susan");
        assertEquals(acct2.last,"walker");

    }

    @Test
    void accountType() {
        String type = account.getAccountType();
        assertEquals("checking",type);

    }

}