package com.jobreadyprogrammer.threading;

import static com.timbuchalka.java.ThreadColors.*;


public class Worker extends Thread{
    Sequence sequence = null;
    String color;

    Worker(Sequence seq) {
        this.sequence = seq;
    }

    void threadColor() {
        switch(Thread.currentThread().getName()) {
            case "Thread-0":
                this.color = ANSI_BLUE;
                break;
            case "Thread-1":
                this.color = ANSI_RED;
                break;
        }
    }


    @Override
    public void run() {
        this.threadColor();
        for(int i=0; i<100; i++) {
            System.out.println(this.color + Thread.currentThread().getName() + " got value: " + sequence.getNext());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
