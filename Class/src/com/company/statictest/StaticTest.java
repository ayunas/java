package com.company.statictest;

public class StaticTest {
    static int instances = 0;
    String name;

    StaticTest(String name) {
        this.name = name;
        instances++;
    }

    static int getInstanceCount() {
        return instances;
    }


}
