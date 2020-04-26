package com.company;

public class StaticInitializationBlock {
    static final int staticNum1 = 10;
    private static final String name = "Static Initialization Block";
    final int num1;

    static {
        System.out.println("static initialization block 1 called");
    }

    StaticInitializationBlock(int num1) {
        System.out.println("Static Init Block constructor called");
        this.num1 = num1;
    }

    static {
        System.out.println("static initialization block 2 called");
    }

    public static void main(String[] args) {
        StaticInitializationBlock s = new StaticInitializationBlock(10);
    }
}
