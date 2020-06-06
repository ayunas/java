package com.healthy_coder.test;
import com.healthy_coder.BMI;
import com.healthy_coder.Coder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {
    BMI bmi = new BMI();
//    Faker faker = new Faker();

    @Test
    void dietNeeded() {
        //should return true if BMI > 25 (BMI Threshold)
        //fail("dietNeeded() failed");
        assertTrue(bmi.dietNeeded(200,72));
    }

    @Test
    void lowBMI() {
        //get the lowest BMI of all coders in the list.
        String[] coderNames = {"amir","nancy","christian","phoenix"};
//        List<Coder> coders = new ArrayList<>();
//        for(int i=0; i<coderNames.length; i++) {
////
////            Coder person = new Coder()
//        }



        fail("lowBMI failed");

    }

    @Test
    void calcBMI() {
        //for a 6 foot 200 lb person, BMI should be 27.1
        Coder coder = new Coder("hacker", new String[]{"html", "css", "js"}, 2, 72, 200);
        double bmi_score = bmi.calcBMI(coder);
        assertEquals(27.0, bmi_score);
    }
}