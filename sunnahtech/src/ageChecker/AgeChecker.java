package ageChecker;

public class AgeChecker {
    static int thresholdAge;

    AgeChecker(int age) {
        thresholdAge = age;
    }

    void checkAge(int age) {
        if (age < thresholdAge) {
            System.out.println("Below the mark: " + "Required age : " + thresholdAge + " Actual age : " + age);
        } else {
            System.out.println("Age old enough");
        }
    }


}
