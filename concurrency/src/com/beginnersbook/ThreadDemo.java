package com.beginnersbook;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Thread demo running");
    }

    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();
        thread.start();
        thread.run();
//        thread.start(); //start is only executed once.
//        thread.run();
    }

}
