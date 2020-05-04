package com.genuwine_coder;

public class Client extends Thread {
    Server server;

    Client(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        while(true) {
            try {
                this.server.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
