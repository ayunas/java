package com.telusko.sync;

import com.timbuchalka.java.ThreadDemo;

public class Counter {
    int value = 0;

    synchronized void increment() {
        this.value++;
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        RThread runnable = new RThread(counter);
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        Thread th3 = new Thread(runnable);

        th1.start();
//        th1.join();
        th2.start();
//        th2.join();
        th3.start();
//        th3.join();

        System.out.println(counter.value);
    }
}



class RThread implements Runnable {
    Counter c;

    RThread(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++) {
            c.increment();
        }
    }
}

