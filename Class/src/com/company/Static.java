package com.company;

public class Static {

    private static String name;

    public Static(String name) {
        System.out.println("Static Constructor");
        Static.name = name;
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name + " is being printed out");
    }

}
