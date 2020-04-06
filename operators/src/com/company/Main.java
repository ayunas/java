package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b = 20;

        int result = a + b;
        System.out.println(result);

        result *= result;
        System.out.println(result);

        result /= 3;

        System.out.println(result);

        result -= 3;

        System.out.println(result);

        boolean isAlien = false;

//        if (isAlien == false) {
//            System.out.println("it is not an alien");
//        }
//
//        if (!isAlien) System.out.println("it is not an alien");

        if (isAlien) //without {} applies only to a single statement executed.
            System.out.println("it is not an alien");  //this will not print since expression is false.
            System.out.println("and i am scared of aliens");

        int first = 50;
        if (first != 100) {
            System.out.println("Didn't reach the top score");
        }

        if (first < 100) System.out.println("top score < 100");
    
        int second = 60;
        if (second > first && first < 100) System.out.println("second score was better than first and first < 100");
        //single & = bitwise AND operator

        // single | = bitwise OR operator.
        if ((first > 70) || (second > 70)) System.out.println("both grades are passing");


        if (2 == 3) System.out.println("weird");

        boolean isCar = false;
        if (isCar = true) System.out.println("this is not supposed to happen");  //assignment operator returns the value, returns true.

        int val = 20;
        if (val == 50) System.out.println("this is not supposed to run");  //it returns 50 and 50 is not a boolean

        boolean wasCar = (val > 15) ? true : false;
        System.out.println(wasCar);
        if (wasCar) System.out.println("wasCar is true");

    }
}