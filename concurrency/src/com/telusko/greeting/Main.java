package com.telusko.greeting;

import static com.timbuchalka.java.ThreadColors.*;

public class Main {

    public static void main(String[] args) {
        Hi greet1 = new Hi();
        Hello greet2 = new Hello();
        Salam greet3 = new Salam();
//        greet1.show();
//        greet2.show();
//        greet3.show();
        greet1.start();
//        try {Thread.sleep(1); } catch(InterruptedException ie){System.out.println(ie.getStackTrace());};
        greet2.start();
//        try {Thread.sleep(1); } catch(InterruptedException ie){System.out.println(ie.getStackTrace());};
        greet3.start();
    }
}



class Hi extends Thread {


    synchronized private void show() {
        for(int i=0; i<5; i++) {
            System.out.println(ANSI_BLUE + "HI!");
            try { Thread.sleep(500); } catch(InterruptedException ie){};
        }
    }

    @Override
    public void run() {
        this.show();
    }

}

class Hello extends Thread {
    synchronized private void show() {
        for(int i=0; i<5; i++) {
            System.out.println(ANSI_RED + "Hello!");
            try { Thread.sleep(500); } catch(InterruptedException ie){};
        }
    }

    @Override
    public void run() {
        this.show();
    }
}

class Salam extends Thread {
    synchronized private void show() {
        for (int i=0; i<5; i++) {
            System.out.println(ANSI_YELLOW + "السلام عليكم و رحمة الله!");
            try { Thread.sleep(500); } catch(InterruptedException ie){};
        }
    }

    @Override
    public void run() {
        this.show();
    }

}







