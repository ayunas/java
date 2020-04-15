package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String hair;

    public Dog(String name, int size, int weight, int eyes, int legs,int tail, int teeth, String hair) {
        super(name,size,weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.hair = hair;
    }


    private void chew() {
        System.out.println(this.getName() + " is chewing kibbles and bits");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() invoked...");
        super.eat();
        this.chew();
    }






}
