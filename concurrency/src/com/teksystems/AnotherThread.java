package com.teksystems;

import static com.teksystems.ThreadColor.ANSI_RED;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(ANSI_RED + "Hello from AnotherThread");
    }
}
