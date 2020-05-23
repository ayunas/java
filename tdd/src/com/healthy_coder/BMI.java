package com.healthy_coder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BMI {
    private static final double BMI_THRESHOLD = 25.0;

    boolean dietNeeded(double weight, double height) {
        if (height == 0) throw new ArithmeticException();
        double bmi = weight / Math.pow(height,2);
        return (bmi < BMI_THRESHOLD) ? false : true;
    }

    Coder lowBMI(ArrayList<Coder> coders) {
        return new Coder("amir", new String[3],3);
    }


    public static void main(String[] args) {
        List<Coder> coders = new ArrayList<>();
        String[] skills = {"javascript","python","java","regex"};
        coders.add(new Coder("amir",new String[]{"js","py","java"},4));
        String[] names = {"amir","christian","julian","sabitha","nancy"};
        for (String n : names) {
            coders.add(new Coder(n,new String[]{"html","css","js"},1));
        }

        System.out.println(coders);



//        String[] skilly = new String[3];
//        skilly[0] = "python";
//        skilly[1] = "react";
//        skilly[2] = "redux";
//
//        System.out.println(Arrays.toString(skilly));
//        System.out.println(Arrays.toString(skills));

        Coder amir = new Coder("amir", new String[]{"js,", "py", "java", "rgx"},3);
    }



}
