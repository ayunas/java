package com.company.AbstractClasses;

public class Penguin extends Animal {


    Penguin(String name) {
        super(name);
    }

    void eat() {
        System.out.println(this.name + " is eating squid, krill, and crustaceans");
    }

    void speak() {
        System.out.println(this.name + " is doing a contact call, a display call, and a threat call to other fellow penguins.");
    }
}
