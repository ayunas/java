package com.company;

public class Main {

    public static void main(String[] args) {
        double x = calc(22.5, 3.5);
        System.out.println(x);

        for (int i=0; i<10; i++) {
            double calculated = calc((22.5+i),(3.5+i));
            System.out.println(calculated);
        }

        while (x > 0) {
            x--;
            System.out.println(x);
        }


    }
    
    public static double calc(double amount, double rate) {
        return amount + amount * (rate / 100);
    }
    
    
}
