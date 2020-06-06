package edabit;

import java.util.Arrays;

class ArrayMultiples {
    //1. create an array with length specified by input
    //2. for loop for the length of the array. each iteration, calculate the multiple, then set it to the next index of the array
    //return the array

    static int[] arrayOfMultiples(int num, int length) {
        int[] multiple = new int[length];
        System.out.println(Arrays.toString(multiple));

        for(int i=1; i<=length; i++) {
            int mul = i * num;
            multiple[i-1] = mul;
        }

        return multiple;
    }

    public static void main(String[] args) {
        int[] multiples = arrayOfMultiples(3,5);
        System.out.println(Arrays.toString(multiples));
    }
}



