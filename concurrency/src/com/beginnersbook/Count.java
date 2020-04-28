package com.beginnersbook;

public class Count extends Thread {

    Count() {
        super("Count Thread");
        System.out.println("count thread created " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                System.out.println("Printing the count " + i);
                sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("My thread run is over");
    }

    public static void main(String[] args) {
        Count count = new Count();
        try {
            while(count.isAlive()) {
                System.out.println("Main thread will be alive until the child thread is live");
                sleep(1000);
            }
        } catch(InterruptedException e) { //if nothing can fail in the try, InterruptedException will never take place.
            System.out.println("Main thread interrupted");
        }
    }
}
