package com.company;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int gills, int eyes, int fins) {
        super("fishy",10,10);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void swim() {

    }


}
