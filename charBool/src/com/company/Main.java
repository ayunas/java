package com.company;

public class Main {

    public static void main(String[] args) {
	// char takes up 2 bytes in memory.  16 bit width
        char char1 = 'D';  //store last keypress, or last digit.
        System.out.println(char1);

//      char char2 = 'DDD';  //error
        char unicode1 = '\ufe8f';
        System.out.println(unicode1);

        boolean bool1 = true;
        boolean bool2 = false;

        boolean isJavaFun = true;

        System.out.println(isJavaFun);

    }
}
