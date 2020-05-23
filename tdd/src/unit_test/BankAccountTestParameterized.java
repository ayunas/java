package unit_test;

public class BankAccountTestParameterized {
    private BankAccount account;

    @org.junit.Before
    void setup() {
        account = new BankAccount("Tim", "Buchalka", 1000.00,"checking");
    }

}
