package com.company;

import java.util.ArrayList;

public class IntWrapper {
    private int intValue;

    IntWrapper(int val) {
        this.intValue = val;
    }

    public int getInt() {
        return this.intValue;
    }

    public void setInt(int val) {
        this.intValue = val;
    }

    public static void main(String[] args) {
        IntWrapper integer = new IntWrapper(13);
        int myInt = integer.getInt();
        System.out.println(myInt);

        Integer int2 = 56;
        System.out.println("int2 created using Integer Wrapper class: " + int2.intValue());

        int int3 = 49; //int3.intValue();  - behind the scenes.
        System.out.println("int3 using primitive : " + int3);

//        ArrayList<Double> doublesList = new ArrayList<Double>();
//        for (double dbl=0d; dbl<10d; dbl+=.5d) {
//            doublesList.add(Double.valueOf(dbl)); //autoboxing.
//            doublesList.add(dbl); // two lines are equivalent.  java does former behind the scenes.
//        }
//
//        for(int i=0; i<doublesList.size(); i++) {
//            double val = doublesList.get(i).doubleValue();
//            System.out.println(val);
//        }

        //Autoboxing of char
        Character gfg = 'a';

        // Auto-unboxing of Character
        char ch = gfg;
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);

        int inty = 30;
        Integer intyBoxed = inty;

        System.out.println("autoboxed the integer: " + intyBoxed);

        Boolean truthy = true;

        boolean truthyUnboxed = truthy;
        System.out.println("unboxed boolean: " + truthyUnboxed);

    }
}


