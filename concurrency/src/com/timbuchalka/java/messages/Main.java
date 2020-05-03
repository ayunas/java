package com.timbuchalka.java.messages;

class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] messages = {
                "Humpty dumpty sat on a wall",
                "Humpty dumpty had a great fall",
                "All the kings horses and all the kings men",
                "couldn't put humpty together again..."
        };

        for (int i=0; i<messages.length; i++) {
            System.out.println(messages[i]);
            Thread.sleep(1000);
        }

    }
}