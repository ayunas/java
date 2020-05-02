package com.beginnersbook;

public class RunningDemo implements Runnable  {

    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                System.out.println("Running demo in a runnable state");
                Thread.sleep(1000);
            }

        } catch(InterruptedException e) {
            System.out.println("thread can no longer execute");
        }
    }

    public static void main(String[] args) {
        RunningDemo runnableThread = new RunningDemo();
        Thread thread = new Thread(runnableThread);
        thread.start();
    }
}
