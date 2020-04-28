package com.beginnersbook.take2;

public class Count extends Thread{


    Count() {
//        super("Count thread");
        System.out.println("starting Count thread");
        start();
    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i=0; i<10; i++) {
                System.out.println("thread keeps going #" + i);
                sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Count thread failed to properly execute");
        }
        System.out.println("Thread has finished running");
    }

    public static void main(String[] args) {
//        Count countThread = new Count();
        new Count();
//        try {
//            while(countThread.isAlive()) {
//                System.out.println("The thread is still remaining!");
//                sleep(1000);
//            }
//        } catch(InterruptedException e) {
//            System.out.println("thread died");
//        }
    }

}
