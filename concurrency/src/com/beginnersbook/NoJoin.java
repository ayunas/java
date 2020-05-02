package com.beginnersbook;

public class NoJoin {

    public static void main(String[] args) {
        Thread th1 = new Thread(new Class1(), "th1");
        Thread th2 = new Thread(new Class1(), "th2");
        Thread th3 = new Thread(new Class1(), "th3");
        th1.start();
        th2.start();
        th3.start();
    }
}


class Class1 implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Thread started: " + t.getName());
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended: " + t.getName());
    }
}
