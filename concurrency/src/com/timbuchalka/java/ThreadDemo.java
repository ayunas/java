package com.timbuchalka.java;

import static com.timbuchalka.java.ThreadColors.*;

public class ThreadDemo extends Thread {

    ThreadDemo() {
        run(); //this runs on same thread of where it was invoked i.e. main
        start(); //this runs in a new thread
    }

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "running the thread demo from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println(ANSI_RED + " Another thread woke me up");
        }

        System.out.println(ANSI_CYAN + " 3 SECONDS HAVE PASSED AND I'M AWAKE");
    }
}
