package com.telusko.produceconsume;

import com.jobreadyprogrammer.threading.inventory.Product;

class X {
    int num;

    void put(int num) {
        this.num = num;
        System.out.println("put : " + this.num);
    }

    void get() {
        System.out.println("get : " + this.num);
    }
}

class Producer implements Runnable {
    X x;

    Producer(X x) {
        this.x = x;
        Thread th1 = new Thread(this,"Producer");  //this converts the runnable producer into a thread.
        th1.start();
    }

    @Override
    public void run() {
        int i=0;
        while(true) {
            this.x.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    X x;

    Consumer(X x) {
        this.x = x;
        Thread th2 = new Thread(this,"Consumer");
        th2.start();
    }


    @Override
    public void run() {

        while(true) {
            this.x.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThread {
    public static void main(String[] args) {
        X resource = new X();
        Consumer con = new Consumer(resource);
        Producer pro = new Producer(resource);
    }
}
