package com.telusko;

import static com.timbuchalka.java.ThreadColors.*;

class Counter {
    private int count;

    Counter(int c) {
        this.count = c;
    }

    synchronized void increment() { //put the synchronized keyword on the shared resource between threads
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

}

public class SyncDemo {

    public static void main(String[] args) {
        Counter c = new Counter(0);

        class RThread implements Runnable {
            @Override
            public void run() {
                String color = new String();
                switch(Thread.currentThread().getName()) {
                    case "Thread 1":
                        color = ANSI_BLUE;
                        break;
                    case "Thread 2":
                        color = ANSI_RED;
                        break;
                    default:
                        color = ANSI_BLACK;
                }

                for (int i=0; i<5000; i++) {
                    c.increment();
//                    System.out.println(color + "thread name: " + Thread.currentThread().getName());
                }
            }
        }

        Thread th1 = new Thread(new RThread());

        Thread th2 = new Thread(new RThread());
        th1.setName("Thread 1");
        th2.setName("Thread 2");
        th1.start();
//        try{ Thread.sleep(1); } catch(InterruptedException ie) {};
        th2.start();
        System.out.println("Counter value : " + c);
//
//
//        c.increment();
//        c.increment();
//        c.increment();

        System.out.println(c.getCount());

    }
}
