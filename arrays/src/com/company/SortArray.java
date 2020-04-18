package com.company;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        if (args.length == 0) System.exit(0);

        int len = Integer.parseInt(args[0]);
        double[] arr = new double[len];

        System.out.println("length of array: " + len);

        for (int i=0; i<len; i++) {
            arr[i] = Math.round(Math.random()*len*100.0) / 100.0;
//            arr[i] = i;
        }

//        Arrays.sort(arr);

        boolean swapped = true;
        double temp;

        System.out.println("array pre sorting: " + Arrays.toString(arr));

        while (swapped) {
            swapped = false;
            for (int i=0; i<len-1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }

        System.out.println("Array after sorting : " + Arrays.toString(arr));
    }



}
