package com.oracle.docs;

public class Main {
    public static void main(String[] args) {
        Counter ctr = new Counter();
        Thread th1 = new Thread(new RThread(ctr));
        Thread th2 = new Thread(new RThread(ctr));
        th1.setName("th1");
        th2.setName("th2");
        th1.start();
        th2.start();
    }
}
