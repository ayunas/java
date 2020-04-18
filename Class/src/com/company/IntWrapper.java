package com.company;

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
    }
}


