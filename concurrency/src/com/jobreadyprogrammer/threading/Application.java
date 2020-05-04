package com.jobreadyprogrammer.threading;

public class Application {

    public static void main(String[] args) throws InterruptedException {  //main thread

        Task taskRunner = new Task("taskRunner A");
        System.out.println("Starting Thread 1");
//        taskRunner.setName("taskRunner A");
        taskRunner.start();

        System.out.println("Hello");

        Task taskRunner2 = new Task("taskRunner B");
        System.out.println("Starting Thread 2");
//        taskRunner2.setName("taskRunnner B");
        taskRunner2.start();

        RTask taskRunner3 = new RTask("taskRunner C");
        Thread th1 = new Thread(taskRunner3);
        th1.start();

    }
}


class Task extends Thread {
    String name;

    Task(String name) {
        this.name = name;
    }



    @Override
    public void run() {

        Thread.currentThread().setName(this.name);

        for(int i=0; i<1000; i++) {
            System.out.println("number : " + i + " - " + Thread.currentThread().getName());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class RTask implements Runnable {
    String name;

    RTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        Thread.currentThread().setName(this.name);

        for(int i=0; i<1000; i++) {
            System.out.println("number : " + i + " - " + Thread.currentThread().getName());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



