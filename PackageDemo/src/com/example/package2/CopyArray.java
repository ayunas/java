package com.example.package2;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) { //needs to be public because accessed outside of the package.  needs to be static because no instance is being created. of copyarray
        System.out.println("String args : " + Arrays.toString(args));

        int[] argsCopy = new int[args.length];
        for (int i=0; i<args.length; i++) {
            argsCopy[i] = Integer.parseInt(args[i]);
        }

        System.out.println("integers args: " + Arrays.toString(argsCopy));

        String[] argsCopy2 = args.clone();
        System.out.println("cloned copy of array: " + Arrays.toString(argsCopy2));

    }




}
