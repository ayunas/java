package com.company.AbstractClasses;

class Parrot extends Animal {

    Parrot(String name) {
        super(name);
    }

    void eat() {
        System.out.println(this.name + " is eating veggies, fruit, fruit seeds, nuts, and flowers");
    }

    void speak() {
        System.out.println(this.name + " is talking just like a human!");
    }
    
}
