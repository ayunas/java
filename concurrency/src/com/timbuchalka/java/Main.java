package com.timbuchalka.java;

import static com.timbuchalka.java.ThreadColors.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread");
        Thread anotherThread = new ThreadDemo();
        anotherThread.setName("=====Another Thread======");
        anotherThread.interrupt();

//        new Thread() {
//            @Override
//            public void run() {
//                System.out.println("Hello from the anonymous class thread");
//            }
//        }
    }

}
