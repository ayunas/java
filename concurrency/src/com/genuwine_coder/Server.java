package com.genuwine_coder;

//Producer / Server - keep on generating data
//Server will store the data structure.
//Consumer / Client - keep on getting data.
    // notify() the Server the client is consuming data.
    //grab the first piece of data.
    //remove it from the list structure.
    //return the first piece of data to the consumer.

//simulate speed of production or consumption with Thread.sleep(ms);
//boundary condition 1 - keep producing till max size reached, then cause the thread to wait()
//boundary condition 2 - keep consuming till data structure is empty.  then cause thread to wait()
//when producing data - notify() the consumer.
//Server - provides functionality.  Client - uses the functionality
//Server / Client run on two separate threads.

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Server extends Thread {
    static List<String> dates = new ArrayList<>();
    static int DATES_LIMIT = 10;

    synchronized void produce() throws Exception {
        if(dates.size() == DATES_LIMIT) {
            System.out.println("Maximum dates reached in list of dates.  Waiting for client.");
            wait();
            System.out.println("Client has notified the Server to continue producing dates");
        }
        String date = LocalDateTime.now().toString();
        dates.add(date);
        Thread.sleep(1000);
        System.out.println("Added new date to the list of dates " + dates.get(dates.size()-1));
        notify();
    }

    synchronized String consume() throws InterruptedException {
        notify(); //notify the server that the client wants to consume data, and can resume producing if hit the limit.

        if(dates.isEmpty()) {
            wait();
        }

        String firstDate = dates.get(0);
        dates.remove(firstDate);
        return firstDate;
    }

    @Override
    public void run() {

        while(true) {
            try {
                this.produce();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
