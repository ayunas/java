package com.company;

public class Main {

    public static void main(String[] args) {

        int val = 10000;
        int minInt = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;

        System.out.println("Integer Min Value = " + minInt);
        System.out.println("Integer Max Value = " + maxVal);
        System.out.println("Overflow Max Value = " + (maxVal+10));  //overflow
        System.out.println("Underflow Min Value = " + (minInt - 1));  //underflow

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

        long longnum3 = 2147483650L;
        System.out.println("long num = " + longnum3);
//        long longnum4 = 2147483650;  //interpreted as an integer literal, which is outside the range of ints. will generate an error.

        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);

        short shortNum = 32767;
        System.out.println("shortNum = " + shortNum);

        byte dividedByte = (10 / 2);
        System.out.println("dividedByte = " + dividedByte);

        System.out.println(minByte);
        int byteInt = minByte / 2;
        System.out.println(byteInt);
        byte byteInt2 = (byte) (minByte / 2);
        System.out.println(byteInt2);
        //convert int to long

        System.out.println(minInt);

        byte byteInt3 = (byte) (minInt / 2);  //int can be type casted into a byte automaticaly, but the minInt is outside of the range of

        byte byte1 = (byte) 8;
        short short1 = (short) 32000;
        int int1 = 10;
        short long1 = (short) (50_000 + 10*(byte1 + short1 + int1));
        System.out.println("long1 mixture of byte short and int = " + long1);



//Integer Min Value = -2147483648
//Integer Max Value = 2147483647
    }
}
