package com.company.AbstractClasses;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void eat();  //definitions not given.  abstracted out
    abstract void speak();
}