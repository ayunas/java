package com.company.statictest;

public class Main {

    public static void main(String[] args) {
        StaticTest instance1 = new StaticTest("#1");
        StaticTest instance2 = new StaticTest("#2");
        StaticTest instance3 = new StaticTest("#3");
        System.out.println("Number of Instances : " + StaticTest.getInstanceCount());
    }
}
