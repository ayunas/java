package com.jobreadyprogrammer.threading.inventory;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        InventoryManager ivm = new InventoryManager();

//        Task populateTask = new Task("populate", ivm);
//        Task displayTask = new Task("display", ivm);
//
//        populateTask.start();
//        displayTask.start();

        Thread popTask = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ivm.populateSoldProducts();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread showTask = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    ivm.displaySoldProducts();
                } catch(InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        });

        popTask.start();
        Thread.sleep(50);
        showTask.start();
    }
}

class Task extends Thread {
    InventoryManager ivm;
    String taskName;

    Task(String name, InventoryManager ivm) {
        this.taskName = name;
        this.ivm = ivm;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(this.taskName);
        switch(this.taskName) {
            case "populate":
                try {
                    this.ivm.populateSoldProducts();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "display":
                try {
                    this.ivm.displaySoldProducts();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
