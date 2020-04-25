package com.buchalka.useseries;
import com.buchalka.series.Series;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long fact = Series.factorial(10);
        System.out.println(fact);
//        for (int i=1; i<10; i++) {
//            System.out.println(Series.nSum(i));
//        }

        for (int i=0; i<10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }

}
