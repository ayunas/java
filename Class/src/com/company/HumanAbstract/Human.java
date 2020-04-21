package com.company.HumanAbstract;


interface Childlike {
    boolean jumpy = true;
    boolean angry = true;
    boolean emotional = true;
    boolean behaved = false;

    void play(String description);
}

interface iToys extends Childlike {
    String toy1 = "Barbie Doll";
    String toy2 = "Minecraft";
    String toy3 = "Drone";

}

abstract class Human {

    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void talk();
    abstract void walk();
}


class Baby extends Human implements Childlike {

    Baby(String name, int age) {
        super(name,age);
    }

    @Override
    void talk() {
        System.out.println(this.name + " goes gaa gaa goo goo.");
    }

    @Override
    void walk() {
        System.out.println(this.name + " is walking step by step.");
    }

    @Override
    public void play(String description) {
        System.out.println(this.name + " " + description);
    }
}


class Main {
    public static void main(String[] args) {
        Baby leeni = new Baby("Aleena",2);
        leeni.talk();
        leeni.walk();
        leeni.play("Not jumpy, well mannered, and has a sense of humor.");
    }
}