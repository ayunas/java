package com.company.InnerClass;

public class Mother {

    String name;
    int age;

    Mother(String name,int age) {
        this.name = name;
        this.age = age;
    }

    void sleep() {
        System.out.println(this.name + " is taking a 5 minute rest away from her baby...");
    }

    class Baby {
        String name;
        double weight;

        Baby(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }

        void burp() {
            System.out.println(this.name + " goes BURPY BURPY!!!");
        }
    }
}
