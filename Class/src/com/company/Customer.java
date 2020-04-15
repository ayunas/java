package com.company;

public class Customer {
    String name;
    String email;
    String address;

    public Customer() {
        this("User", "email@email.com", "123 one way");
    }

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }


}
