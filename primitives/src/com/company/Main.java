package com.company;

public class Main {

    public static void main(String[] args) {



        int val = 10000;
        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;

        System.out.println("Integer Min Value = " + minVal);
        System.out.println("Integer Max Value = " + maxVal);
        System.out.println("Overflow Max Value = " + (maxVal+10));  //overflow
        System.out.println("Underflow Min Value = " + (minVal - 1));  //underflow

        int commaInt = 2_147_483_647;
        System.out.println(commaInt);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("minByte = " + minByte);
        System.out.println("maxByte = " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("minshort = " + minShort);
        System.out.println("maxShort = " + maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        long longNum = 123456L;  //assign a literal long to a long variable.
        long longNum2 = 123456; // assign a literal int to a long variable.
        System.out.println("longNum = " + longNum);

        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);

        short shortNum = 32767;
        System.out.println("shortNum = " + shortNum);

        //convert int to long




//Integer Min Value = -2147483648
//Integer Max Value = 2147483647
    }
}
