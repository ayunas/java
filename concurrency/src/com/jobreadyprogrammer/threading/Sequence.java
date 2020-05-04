package com.jobreadyprogrammer.threading;

public class Sequence {
    int value = 0;


    synchronized int getNext() {
//        synchronized(this) {  //the thread executing this code block has acquired a lock until it completes the execution of the code.
            this.value++;
            return value;
//        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        Worker worker1 = new Worker(sequence);
        Worker worker2 = new Worker(sequence);
        worker1.start();
        worker2.start();




//        Sequence sequence = new Sequence();
//        for(int i=0; i<100; i++) {
//            System.out.println(sequence.getNext());
//        }
    }
}
