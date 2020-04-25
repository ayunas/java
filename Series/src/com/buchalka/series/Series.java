package com.buchalka.series;

import java.util.ArrayList;
import java.util.Arrays;

public class Series {

    public static long nSum(int n) {
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n) {
        int prod = 1;
        for (int i=1; i<=n; i++) {
            prod *= i;
        }
        return prod;
    }

     static long fibonacci(int n) {
        int i = 2;
        int sum = 0;
        ArrayList<Integer> fibonaccis = new ArrayList<>();
        fibonaccis.addAll(Arrays.asList(0,1));

        while (i < n) {
            int z = fibonaccis.size()-1; //last index of fibonacci
            int y = fibonaccis.size()-2; //next to last index
            int last = fibonaccis.get(z);
            int nextLast = fibonaccis.get(y);
            int next = last + nextLast;
            fibonaccis.add(next);
            i++;
        }

        int nth = fibonaccis.get(fibonaccis.size() - 1);
        return nth;
    }
}
