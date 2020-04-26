package com.company;

public class Password {
    private static final int key = 83475748;
    private final int encryptedPassword;

    Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    int encryptDecrypt(int password) {
        return password ^ key;
    }

    final void storePassword() {
        System.out.println("Saving password as : " + this.encryptedPassword);
    }

    public boolean letMeIn(int pass) {
        if (this.encryptDecrypt(pass) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("password invalid");
            return false;
        }
    }
}
