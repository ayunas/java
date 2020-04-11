package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

    public static void main(String[] args) {
        //take in numbers and put it into an array
        //sort the array descending
        //output the array to the screen;
        int[] intArray = getIntegers(args);
//        System.out.println(Arrays.toString(intArray));

        int[] sortedInts = sortIntegers(intArray);
        

    }

    public static int[] getIntegers(String[] args) {
        System.out.println(Arrays.toString((args)));

        int[] ints = new int[args.length];

        for (int i=0; i<args.length; i++) {
            System.out.println(args[i]);
            int digit = Integer.parseInt(args[i]);
            ints[i] = digit;
        }
        return ints;
    }

    public static int[] sortIntegers(int[] ints) {
        System.out.println("ints array in sortIntegers" + Arrays.toString(ints));
        int[] decreasing = new int[ints.length];
        System.out.println("before reversal" + Arrays.toString(ints));
        Arrays.sort(ints);

        for (int i=0; i<ints.length; i++) {
            int index = ints.length - 1;
//            System.out.println(ints.length - i);
//            System.out.println(i);
            decreasing[index-i] = ints[i];
        }
        System.out.println("after reversal: " + Arrays.toString(decreasing));

//        System.out.println(Arrays.toString(ints));

        return ints;
    }

    public void printArray() {

    }









}
