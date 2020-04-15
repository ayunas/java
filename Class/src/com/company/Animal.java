package com.company;//Inheritance in Java
//com.company.Animal has properties that all children classes will share.


public class Animal {
    private String name;
    private int size;
    private int weight;

    public Animal(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public String getName() {
        return this.name;
    }


    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }






}


