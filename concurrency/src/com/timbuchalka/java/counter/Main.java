package com.timbuchalka.java.counter;

import com.teksystems.ThreadColor;

import static com.timbuchalka.java.ThreadColors.*;

public class Main {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();
        CountdownThread th1 = new CountdownThread(countdown);
        CountdownThread th2 = new CountdownThread(countdown);
        th1.setName("Thread 1");
        th2.setName("Thread 2");

        th1.start();
        th2.start();

        int[] array = new int[500];

    }

}

class Countdown {

    private int i;

    synchronized public void doCountDown() {
        String color;

        switch(Thread.currentThread().getName()) {
            case "Thread 1":
                color = ANSI_CYAN;
                break;
            case "Thread 2":
                color = ANSI_MAGENTA;
                break;
            default:
                color = ANSI_GREEN;
        }

//        for(i=10; i > 0; i--) {
//            System.out.println(color + Thread.currentThread().getName() + " : i =" + i);
//        }

        for(int j=10; j > 0; j--) {
            System.out.println(color + Thread.currentThread().getName() + " : j =" + j);
        }

    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

   CountdownThread(Countdown countdown) {
       this.threadCountdown = countdown;
   }

   @Override
    public void run() {
      this.threadCountdown.doCountDown();
   }

}
