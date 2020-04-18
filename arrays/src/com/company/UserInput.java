package com.company;

//accept user input of 5 numbers. -> "Element i, typed value was x"

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (args.length == 0) System.exit(0);
        int num = Integer.parseInt(args[0]);
        int[] integers = getIntegers(num);
        System.out.println(Arrays.toString(integers));
    }

    static int[] getIntegers(int num) {
        int[] numbers = new int[num];

        for (int i=0; i<numbers.length; i++) {
            System.out.println("Enter an integer: ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }





}
