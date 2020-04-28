package com.teksystems;

import static com.teksystems.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the main thread");
        Thread thread1 = new AnotherThread();
        thread1.run();

        System.out.println(ANSI_BLUE + "Hello again from the main thread");
        thread1.start();
        //thread1.start();  //cannot restart a thread.
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch(InterruptedException e) {
                    System.out.println(ANSI_RED + "Another Thread woke me up");
                }
                System.out.println(ANSI_GREEN + "Hello from anonymous thread");
            }
        }.run();

        System.out.println(ANSI_BLACK+"Hello yet again from the main thread");
    }

}
