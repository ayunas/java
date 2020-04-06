package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArr0 = new int[20];

        System.out.println(Arrays.toString(intArr0));

        printArr(intArr0);


        int[] intArr = new int[10];
//        intArr[5] = 50;
//        intArr[2] = 20;
//        intArr[1] = 10;

        int[] intArr2 = {1,2,3,4,5,6,7,8,9,10};  //shorthand way to fill an array up.

        double[] dubArr = new double[22];
        dubArr[1] = 30d;

//        System.out.println(intArr[2]);
//        System.out.println(intArr[1]);

        for (int i=0; i<intArr.length; i++) {
            intArr[i] = i*10;
        }

//        printArr(intArr);

    }

    public static void printArr(int[] arr) {
        System.out.println("Print using for loop");
        for (int i=0; i<arr.length; i++) {
            System.out.println("Element " + i + " Value is " + arr[i]);
        }

        System.out.println("print using toString()");
        System.out.println(Arrays.toString(arr));

    }



}
