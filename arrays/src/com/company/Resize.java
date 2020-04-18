package com.company;

import java.util.Arrays;

public class Resize {

    public static void main(String[] args) {
//        int[] ints = {1,2,3,4,5};
//        int[] intscopy = ints.clone();
        int size = Integer.parseInt(args[0]);
        int[] argscopy = new int[args.length-1];

        System.out.println(Arrays.toString(args));

        for (int i=1; i<args.length; i++) {
            argscopy[i-1] = Integer.parseInt(args[i]);
        }

        System.out.println(Arrays.toString(argscopy));

        int[] resizedArr = resizeArr(argscopy, size);
        System.out.println(Arrays.toString(resizedArr));
    }
//
    static int[] resizeArr(int[] arr, int size) {

        int[] resized = new int[size];
        System.out.println("resized array: " + Arrays.toString(resized));

        for (int i=0; i<arr.length; i++) {
            resized[i] = arr[i];
        }

        return resized;
    }


}
