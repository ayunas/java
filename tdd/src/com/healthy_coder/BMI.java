package com.healthy_coder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BMI {
    private static final double BMI_THRESHOLD = 25.0;

    public boolean dietNeeded(double weight, double height) {
        if (height == 0) throw new ArithmeticException();
        double bmi = 703 *  (weight / Math.pow(height,2));
        return (bmi < BMI_THRESHOLD) ? false : true;
    }

    static com.healthy_coder.Coder lowBMI(List<com.healthy_coder.Coder> coders) {
        //find the lowest BMI of all coders in the list.  calc bmi for each one.  push each value to an array, and find the min.
        double[] bmiReadings = new double[coders.size()];

        for (int i=0; i<coders.size(); i++) {
            bmiReadings[i] = calcBMI(coders.get(i));
        }
        System.out.println(Arrays.toString(bmiReadings));

        return coders.get(0);
    }

    public static double calcBMI(com.healthy_coder.Coder coder) {
        //BMI = 703 * (lbs / inches^2)
        System.out.println(coder);
        double height = coder.getHeight();
        double weight = coder.getWeight();
//        System.out.println(height);
//        System.out.println(weight);

        if(height == 0.0) throw new ArithmeticException();
        double bmi = 703 * (weight / Math.pow(height,2));
        System.out.println(coder.getName() + " " + bmi);
        return Math.round(bmi);
    }

    public static void main(String[] args) {
        List<com.healthy_coder.Coder> coders = new ArrayList<>();

        String[] names = {"amir","christian","julian","sabitha","nancy"};

        Random rand = new Random();

        for (String n : names) {
//            int randomHeight = rand.ints(1,60,72).findFirst().getAsInt();
//            int randomWeight = rand.ints(1,100,400).findFirst().getAsInt();
            coders.add(new com.healthy_coder.Coder(n,new String[]{"html","css","js"},1,randomHeight,randomWeight));
        }

        lowBMI(coders);
    }
}
