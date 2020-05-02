package com.beginnersbook;

class Joining {
    public static void main(String[] args) {
        Thread th1 = new Thread(new RThread(),"th1");
        Thread th2 = new Thread(new RThread(), "th2");
        Thread th3 = new Thread(new RThread(), "th3");

        th1.start();

        try {
            th1.join();
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }

        th2.start();

        try {
            th2.join();
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
        th3.start();

        try {
            th3.join();
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("all 3 threads have finished execution");
    }
}

class RThread implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Thread started: " + t.getName());
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Thread ended: " + t.getName());
    }
}