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

     public static long fibonacci(int n) {
        //create an array of ints of size n
         int[] f = new int[n];
         f[0] = 0;
         f[1] = 1;

         for (int i=2; i<=n; i++) {
             f[i] = f[i-2] + f[i-1];
             System.out.println(f[i]);
         }

         System.out.println(Arrays.toString(f));
         return f[n];

//        if (n == 0) return 0;
//        if (n == 1) return 1;
//
//        int i = 2;
//        int sum = 0;
//        ArrayList<Integer> fibonaccis = new ArrayList<>();
//        fibonaccis.addAll(Arrays.asList(0,1));
//
//        while (i < n) {
//            int z = fibonaccis.size()-1; //last index of fibonacci
//            int y = fibonaccis.size()-2; //next to last index
//            int last = fibonaccis.get(z);
//            int nextLast = fibonaccis.get(y);
//            int next = last + nextLast;
//            fibonaccis.add(next);
//            i++;
//        }
//
//        int nth = fibonaccis.get(fibonaccis.size() - 1);
//        return nth;
    }
}
