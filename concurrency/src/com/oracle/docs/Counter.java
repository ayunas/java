package com.oracle.docs;

import static com.timbuchalka.java.ThreadColors.*;

class Counter {
    private int c = 0;

    void increment() {
        this.c++;
    }

    void decrement() {
        this.c--;
    }

    int getCount() {
        return this.c;
    }
}


class RThread implements Runnable {
    Counter counter;
    String color;

    RThread(Counter ctr) {
        this.counter = ctr;
    }

    synchronized void color() {
        switch(Thread.currentThread().getName()) {
            case "th1":
                this.color = ANSI_CYAN;
                break;
            case "th2":
                this.color = ANSI_RED;
                break;
            default:
                this.color = ANSI_BLUE;
        }
        for(int i=0; i<10; i++) {
            this.counter.increment();
            System.out.println(this.color + "Incrementing counter to : " + this.counter.getCount());
        }
    }

    @Override
    public void run() {
        this.color();
    }
}

