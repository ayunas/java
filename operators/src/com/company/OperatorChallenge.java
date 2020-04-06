package com.company;

import org.w3c.dom.ls.LSOutput;

public class OperatorChallenge {

    public static void main(String[] args) {
        double dub1 = 20.00d;
        double dub2 = 80.00d;
        double result = (dub1 + dub2)*100;
        System.out.println("result: " + result);
        result = result % 40.00;
        boolean boolResult = (result == 0) ? true : false;
        System.out.println(boolResult);

        if (!boolResult) {
            System.out.println("Got some remainder");
        }

        System.out.println(!boolResult ? "Got some remainder" : "Did not get a remainder");

    }

}
