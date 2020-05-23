package unit_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    static BankAccount account = new BankAccount("amir","yunas",1000,"checking");

    @org.junit.Before
    public static void beforeClass() {
        System.out.println("this runs before the bank account tests");
    }

    @Test
    void deposit() {
        BankAccount acct1 = new BankAccount("ibrahim","yunas",1000,"savings");
        double balance = acct1.withdraw(200,true);
        assertEquals(balance,800);
    }

//    @Test
    @org.junit.Before
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

//    @org.junit.Test
    @Test
    void accountType() {
        String type = account.getAccountType();
//        assertEquals("checking",type);
        assertTrue(account.isChecking(),"This account is not a checking account");

    }

}