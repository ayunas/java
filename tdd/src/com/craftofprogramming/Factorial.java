package com.craftofprogramming;

public class Factorial {

    static int compute(int n) {
        if (n < 2) {
            return 1;
        }
        return n*compute(n-1);
    }

    public static void main(String[] args) {
        int value = compute(5);
        System.out.println(value);
    }
}

